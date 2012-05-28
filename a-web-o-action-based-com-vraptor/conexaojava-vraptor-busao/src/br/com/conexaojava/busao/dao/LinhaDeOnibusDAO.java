package br.com.conexaojava.busao.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.conexaojava.busao.modelo.Coordenada;
import br.com.conexaojava.busao.modelo.LinhaDeOnibus;
import br.com.conexaojava.busao.modelo.Ponto;

public class LinhaDeOnibusDAO {

	private List<LinhaDeOnibus> onibus = new ArrayList<LinhaDeOnibus>();
	
	public LinhaDeOnibusDAO() {
		LinhaDeOnibus busao = new LinhaDeOnibus();
		busao.setLinha("501M-10");
		busao.setNome("Vila Clara - Pca. Da Se Circular");
		
		Ponto p = new Ponto();
		p.setNome("R. Nelson Fernandes, 234");
		Coordenada c = new Coordenada();
		c.setLatitude(-23.6466);
		c.setLongitude(-46.6389);
		p.setLocalizacao(c);
		busao.adiciona(p);

		p = new Ponto();
		p.setNome("R. Dos Comerciarios, 243");
		c = new Coordenada();
		c.setLatitude(-23.6473);
		c.setLongitude(-46.6395);
		p.setLocalizacao(c);
		busao.adiciona(p);

		p = new Ponto();
		p.setNome("Av. Dos Jequitibas, 382");
		c = new Coordenada();
		c.setLatitude(-23.646);
		c.setLongitude(-46.6443);
		p.setLocalizacao(c);
		busao.adiciona(p);

		p = new Ponto();
		p.setNome("Av. Eng. George Corbisier, 151");
		c = new Coordenada();
		c.setLatitude(-23.6382);
		c.setLongitude(-46.642);
		p.setLocalizacao(c);

		p = new Ponto();
		p.setNome("Av. Eng. Armando De Arruda Pereira, 995");
		c = new Coordenada();
		c.setLatitude(-23.6361);
		c.setLongitude(-46.6411);
		p.setLocalizacao(c);
		busao.adiciona(p);
		
		/*
		 * poderia ter mais pontos e inclusive mais linhas de onibus aqui 
		*/
		
		onibus.add(busao);
	}
	
	public LinhaDeOnibus daLinha(String linha) {
		for(LinhaDeOnibus o : onibus) {
			if(linha.equals(o.getLinha())) {
				return o;
			}
		}
		throw new RuntimeException("Não foi encontrado nenhum onibus para a linha " + linha);
	}
}
