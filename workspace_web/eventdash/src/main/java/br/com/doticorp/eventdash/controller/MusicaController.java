package br.com.doticorp.eventdash.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.doticorp.eventdash.dao.MusicaDAO;
import br.com.doticorp.eventdash.model.Musica;

@RestController
@CrossOrigin("*")
public class MusicaController {

	@Autowired
	private MusicaDAO dao;
	
	@GetMapping("/cadastro/{ini}/{fim}")
	public ResponseEntity<List<Musica>> getIntervalo(@PathVariable String ini, @PathVariable String fim){
		try {
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
		Date vini = formato.parse(ini);
		Date vfim = formato.parse(fim);
		List<Musica> lista = dao.findByCadastroBetween(vini, vfim);
		if (lista.size() == 0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(500).build();
		}
	
	}
		
	
	
}
