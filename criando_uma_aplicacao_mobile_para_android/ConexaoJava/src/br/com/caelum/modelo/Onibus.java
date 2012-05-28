package br.com.caelum.modelo;

import java.util.ArrayList;
import java.util.List;

public class Onibus {
	private String nome;
	private String linha;
	private List<PontoDeOnibus> pontos = new ArrayList<PontoDeOnibus>();

	public Onibus() {
	}
	
	public Onibus(String nome, String linha) {
		this.nome = nome;
		this.linha = linha;
	}

	@Override
	public String toString() {
		return linha;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLinha() {
		return linha;
	}

	public void setLinha(String linha) {
		this.linha = linha;
	}

	public List<PontoDeOnibus> getPontos() {
		return pontos;
	}

	public void setPontos(List<PontoDeOnibus> pontos) {
		this.pontos = pontos;
	}

	public void adiciona(PontoDeOnibus ponto) {
		this.pontos.add(ponto);
	}
}
