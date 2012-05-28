package br.com.caelum.busao;

public class Onibus {

	private String linha;
	private String nome;

	public Onibus(String linha, String nome) {
		this.linha = linha;
		this.nome = nome;
	}

	public String getLinha() {
		return linha;
	}
	
	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		return linha + " - " + nome; 
	}
}
