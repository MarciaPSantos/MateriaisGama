package br.com.doticorp.eventdash.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="TB_ARTISTA")
public class Artista {
	
	@Id //informa que o atributo está associado a PK
	@GeneratedValue(strategy = GenerationType.IDENTITY) // aplica o autoincremento
	@Column(name="id")
	private int id;
	
	@Column(name="nomeartistico", length=30)
	private String nomeArtistico;
	
	@Column(name="nacionalidade", length=30)
	private String nacionalidade;
	
	@OneToMany(mappedBy="artista", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("artista")                          //artista é o atributo que está em Musica
	private List<Musica> musicas;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeArtistico() {
		return nomeArtistico;
	}
	public void setNomeArtistico(String nomeArtistico) {
		this.nomeArtistico = nomeArtistico;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public List<Musica> getMusicas() {
		return musicas;
	}
	public void setMusicas(List<Musica> musicas) {
		this.musicas = musicas;
	}
	public Artista(int id, String nomeArtistico, String nacionalidade, List<Musica> musicas) {
		super();
		this.id = id;
		this.nomeArtistico = nomeArtistico;
		this.nacionalidade = nacionalidade;
		this.musicas = musicas;
	}
	public Artista() {
		super();
	}
	@Override
	public String toString() {
		return "Artista [id=" + id + ", nomeArtistico=" + nomeArtistico + ", nacionalidade=" + nacionalidade
				+ ", musicas=" + musicas + "]";
	}
	
	
}
