package br.com.doticorp.eventdash.controller;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.doticorp.eventdash.dao.UsuarioDAO;
import br.com.doticorp.eventdash.model.Usuario;


	@RestController
	@CrossOrigin("*")                  //permite acesso externo (fora do servidor) la no http
	public class UsuarioController{
		
		@Autowired              //permite injetar dependência da interface dao
		private UsuarioDAO dao;
		
		@GetMapping("/usuarios")
		public ArrayList<Usuario> recuperarTodos(){
			ArrayList<Usuario> lista;
			lista = (ArrayList<Usuario>)dao.findAll();
		return lista;
		}
		
		
		@PostMapping("/login")
		public ResponseEntity<Usuario> fazerLogin(@RequestBody Usuario dadosLogin) {
			Usuario resultado = dao.findByEmailOrRacf(dadosLogin.getEmail(), dadosLogin.getRacf());
			if (resultado != null) {  // opa.. usuário existe
				if (resultado.getSenha().equals(dadosLogin.getSenha())) { // a senha confere
					return ResponseEntity.ok(resultado);
				}
				else {
					return ResponseEntity.status(403).build();
				}
			}
			else {
				return ResponseEntity.notFound().build();
			}
		}
		
		
}
		
	
		
		
		

