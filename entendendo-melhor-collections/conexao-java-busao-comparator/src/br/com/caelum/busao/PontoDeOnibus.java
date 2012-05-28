package br.com.caelum.busao;

import java.util.List;

public class PontoDeOnibus {

	private String nome;
	private Coordenada localizacao;
	private List<Onibus> onibuses;

	public PontoDeOnibus(String nome, Coordenada localizacao, List<Onibus> onibuses) {
		this.nome = nome;
		this.localizacao = localizacao;
		this.onibuses = onibuses;
	}

	public boolean passa(Onibus onibus) {
		for (Onibus o : this.onibuses) {
			if (o.getLinha().equals(onibus.getLinha())) {
				return true;
			}
		}
		return false;
	}

	public void adicionaOnibus(Onibus onibus) {
		if (!onibuses.contains(onibus)) {
			onibuses.add(onibus);
		}
	}

	public void removeOnibus(Onibus onibus) {
		onibuses.remove(onibus);
	}

	public String getNome() {
		return nome;
	}

	public Coordenada getLocalizacao() {
		return localizacao;
	}

	public List<Onibus> getOnibuses() {
		return onibuses;
	}

}
