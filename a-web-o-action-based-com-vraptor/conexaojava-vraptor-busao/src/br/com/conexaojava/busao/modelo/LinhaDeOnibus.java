package br.com.conexaojava.busao.modelo;

import java.util.ArrayList;
import java.util.List;

public class LinhaDeOnibus {
	private String nome;
	private String linha;
	
	private List<Ponto> pontos = new ArrayList<Ponto>();

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

	public List<Ponto> getPontos() {
		return pontos;
	}

	public void setPontos(List<Ponto> pontos) {
		this.pontos = pontos;
	}

	public void adiciona(Ponto p) {
		pontos.add(p);
	}
}
