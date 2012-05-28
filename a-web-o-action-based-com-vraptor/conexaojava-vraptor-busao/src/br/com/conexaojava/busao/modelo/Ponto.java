package br.com.conexaojava.busao.modelo;

public class Ponto {
	private String nome;
	private String descricao;

	private Coordenada localizacao;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Coordenada getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(Coordenada coordenada) {
		this.localizacao = coordenada;
	}

}
