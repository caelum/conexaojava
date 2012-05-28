package br.com.caelum.busao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Onibus {
	/*
 * 
 */
	private Integer id;
	private String nome;
	private String linha;
	private List<Ponto> pontos = new ArrayList<Ponto>();
	
	public Onibus() {
		System.out.println("instanciando o busu..");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		System.out.println("definindo o nome");
		this.nome = nome;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}


	public String getLinha() {
		return linha;
	}

	public void setLinha(String linha) {
		this.linha = linha;
	}

	@Override
	public String toString() {
		return nome + ";" + linha;
	}

	public void adiciona(Ponto ponto) {
		this.pontos.add(ponto);
	}
	
	public List<Ponto> getPontos() {
		return Collections.unmodifiableList(this.pontos);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Onibus other = (Onibus) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
