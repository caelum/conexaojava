package br.com.caelum.busao.testes;

import java.util.HashSet;

import br.com.caelum.busao.Coordenada;
import br.com.caelum.busao.Onibus;
import br.com.caelum.busao.PontoDeOnibus;

public class TestaPontosDeOnibus {

	public static void main(String[] args) {
		PontoDeOnibus ponto = new PontoDeOnibus("um ponto", new Coordenada(34.4323, 43.23234)
												, new HashSet<Onibus>());

		Onibus jabaquaraTremembe = new Onibus("175T/10", "Jabaquara - Jd. Tremembe");
		ponto.adicionaOnibus(jabaquaraTremembe);

		Onibus vilaMarianaPirituba = new Onibus("143/10", "Vila Mariana - Pirituba");
		ponto.adicionaOnibus(vilaMarianaPirituba);
		
		// e se eu tentasse adicionar o mesmo onibus de novo?
		Onibus vilaMarianaPirituba2 = new Onibus("143/10", "Pirituba - Vila Mariana");
		ponto.adicionaOnibus(vilaMarianaPirituba2);
		
//		List<Onibus> onibuses = ponto.getOnibuses();
//		onibuses.add(vilaMarianaPirituba);
		
		for (Onibus onibus : ponto.getOnibuses()) {
			System.out.println(onibus.getLinha());
		}
	}
}
