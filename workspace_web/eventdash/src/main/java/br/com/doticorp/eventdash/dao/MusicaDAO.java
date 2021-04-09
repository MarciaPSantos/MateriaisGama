package br.com.doticorp.eventdash.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.doticorp.eventdash.model.Musica;

public interface MusicaDAO extends CrudRepository<Musica, Integer> {
	
	public List<Musica> findByCadastroBetween(Date inicio, Date fim);

}
