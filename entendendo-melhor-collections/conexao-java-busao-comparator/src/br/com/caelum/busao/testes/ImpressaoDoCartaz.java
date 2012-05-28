package br.com.caelum.busao.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.caelum.busao.Coordenada;
import br.com.caelum.busao.Onibus;
import br.com.caelum.busao.PontoDeOnibus;

public class ImpressaoDoCartaz {

	public static void main(String[] args) {
		PontoDeOnibus terminal = criacaoDoPonto();
		
		List<Onibus> onibuses = terminal.getOnibuses();
		
		System.out.println("Ordenado por linha: ");
		Collections.sort(onibuses, new Comparator<Onibus>() {

			@Override
			public int compare(Onibus onibus, Onibus outroOnibus) {
				return onibus.getLinha().compareTo(outroOnibus.getLinha());
			}
		});
		for (Onibus onibus : onibuses) {
			System.out.println(onibus);
		}
		
		System.out.println("\nOrdenado por nome: ");
		Collections.sort(onibuses, new Comparator<Onibus>() {
			
			@Override
			public int compare(Onibus onibus, Onibus outroOnibus) {
				return onibus.getNome().compareTo(outroOnibus.getNome());
			}
		});
		for (Onibus onibus : onibuses) {
			System.out.println(onibus);
		}
	}

	private static PontoDeOnibus criacaoDoPonto() {
		List<Onibus> onibuses = new ArrayList<>();
		onibuses.add(new Onibus("2002/10", "TERMINAL BANDEIRA"));
		onibuses.add(new Onibus("5108/10", "JARDIM CELESTE"));
		onibuses.add(new Onibus("9300/10", "TERMINAL CASA VERDE"));
		onibuses.add(new Onibus("2290/10", "TERMINAL SÃO MATEUS"));
		onibuses.add(new Onibus("5111/10", "TERMINAL SANTO AMARO"));
		onibuses.add(new Onibus("5300/10", "TERMINAL SANTO AMARO"));
		onibuses.add(new Onibus("6403/10", "TERMINAL JOÃO DIAS"));
		onibuses.add(new Onibus("3539/10", "CIDADE TIRADENTES"));

		return new PontoDeOnibus("Parque Dom Pedro", new Coordenada(-23.546756,-46.630302), onibuses);
	}
}
