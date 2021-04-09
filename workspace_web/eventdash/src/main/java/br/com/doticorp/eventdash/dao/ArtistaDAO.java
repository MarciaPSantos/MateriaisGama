package br.com.doticorp.eventdash.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.doticorp.eventdash.model.Artista;

public interface ArtistaDAO extends CrudRepository<Artista, Integer> {

}
