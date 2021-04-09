package br.com.doticorp.eventdash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.doticorp.eventdash.dao.ArtistaDAO;
import br.com.doticorp.eventdash.model.Artista;

@RestController
@CrossOrigin("*")
public class ArtistaController {
	
	@Autowired
	private ArtistaDAO dao;
	
	// pesquisa por ID com o Post
	@PostMapping("/artistapost")
	public ResponseEntity<Artista> getArtista(@RequestBody Artista artista) {
		Artista resultado = dao.findById(artista.getId()).orElse(null);
		if (resultado == null) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(resultado);
	}
	
	
	// pesquisa por ID com o Get
	@GetMapping ("artista/{cod}")                           //{} - serve para informar um valor na URL
	public ResponseEntity<Artista> getArtista(@PathVariable int cod) {      // essa variável deve ter o mesmo nome do que foi definido acima
		Artista resultado = dao.findById(cod).orElse(null);
		if (resultado == null) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(resultado);
	}
	
	
	@GetMapping("/artistas")
	//metodo retorna uma lista indefinida de artistas, por isso precisa ser uma lista
	public ResponseEntity<List<Artista>> getAll(){
		List<Artista> lista = (List<Artista>) dao.findAll();  //precisou fazer um cast da List<Artista por causa do tipo do findAll              >
		if (lista.size() == 0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}
	
	
	
	
}
