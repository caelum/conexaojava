package br.com.caelum.modelo;

import br.com.caelum.modelo.Coordenada;

import com.google.android.maps.OverlayItem;


public class PontoDeOnibus {
	private String nome;
	private Coordenada localizacao;
	
	public PontoDeOnibus() {
	}
	
	public PontoDeOnibus(String nome, Coordenada localizacao) {
		this.nome = nome;
		this.localizacao = localizacao;
	}

	public OverlayItem toOverlayItem() {
		return new OverlayItem(this.localizacao.toGeoPoint(), "Localização:", this.nome);
	}
	
	@Override
	public String toString() {
		return nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Coordenada getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(Coordenada localizacao) {
		this.localizacao = localizacao;
	}

}
