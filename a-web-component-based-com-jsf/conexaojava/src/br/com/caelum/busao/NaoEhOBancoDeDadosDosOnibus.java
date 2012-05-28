package br.com.caelum.busao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class NaoEhOBancoDeDadosDosOnibus {

	private static List<Onibus> onibuses = new ArrayList<Onibus>();
	

	
	public static void adiciona(Onibus onibus) {
		onibuses.add(onibus);
	}
	
	public static Collection<Onibus> lista() {	
		return onibuses;
	}
}
