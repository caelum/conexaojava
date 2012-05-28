package br.com.caelum.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.modelo.Coordenada;
import br.com.caelum.modelo.Onibus;
import br.com.caelum.modelo.PontoDeOnibus;

public class OnibusRepository {

	private List<Onibus> listaDeOnibus = new ArrayList<Onibus>();
	
	public OnibusRepository() {
		Onibus busao1 = new Onibus("Vila Albertina - Metro Santana", "1786-10");
		
		busao1.adiciona( new PontoDeOnibus("R. Luis De Oliveira Bulhoes", new Coordenada(-23.4509, -46.6073)));
		busao1.adiciona( new PontoDeOnibus("R. Bernardo Fonseca Lobo, 629", new Coordenada(-23.4503, -46.6082)));
		busao1.adiciona( new PontoDeOnibus("R. Antonio Joaquim De Oliveira, 413", new Coordenada(-23.4486, -46.6089)));
		busao1.adiciona( new PontoDeOnibus("R. Antonio Joaquim De Oliveira, 263", new Coordenada(-23.449, -46.6104)));
		busao1.adiciona( new PontoDeOnibus("R. Antonio Joaquim De Oliveira, 75", new Coordenada(-23.4504, -46.6112)));
		busao1.adiciona( new PontoDeOnibus("R. Com. Armando Pereira, 34", new Coordenada(-23.4502, -46.6124)));
		busao1.adiciona( new PontoDeOnibus("R. Com. Armando Pereira, 298", new Coordenada(-23.4481, -46.6121)));
		
		listaDeOnibus.add(busao1);
		
		Onibus busao2 = new Onibus("Vila Clara - Pca. Da Se Circular", "501M-10");
		
		busao2.adiciona( new PontoDeOnibus("R. Nelson Fernandes, 234", new Coordenada(-23.6466, -46.6389)) );
		busao2.adiciona( new PontoDeOnibus("R. Dos Comerciarios, 243", new Coordenada(-23.6473, -46.6395)) );
		busao2.adiciona( new PontoDeOnibus("Av. Dos Jequitibas, 382",  new Coordenada(-23.646, -46.6443)) );
		busao2.adiciona( new PontoDeOnibus("Av. Eng. George Corbisier, 151",  new Coordenada(-23.6382, -46.642)) );
		busao2.adiciona( new PontoDeOnibus("Av. Eng. Armando De Arruda Pereira, 995",  new Coordenada(-23.6361, -46.6411)) );
		
		listaDeOnibus.add(busao2);
		/*
		 * poderia ter mais pontos e inclusive mais linhas de onibus aqui 
		*/
	}
	
	public Onibus umOnibus() {
		return listaDeOnibus.get(0);
	}
	
	public Onibus daLinha(String linha) {
		/*
		 * poderia buscar no SQLite do aparelho 
		*/
		
		for(Onibus o : listaDeOnibus) {
			if(linha.equals(o.getLinha())) {
				return o;
			}
		}
		throw new RuntimeException("Não foi encontrado nenhum onibus para a linha " + linha);
	}
}