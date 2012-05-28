package br.com.caelum.busao.testes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import br.com.caelum.busao.Onibus;

public class TestaBusaoMuitoMegaAbsurdamente {
	public static void main(String[] args) {
//		System.out.print("Vector: ");
//		List<Onibus> vector = new Vector<>();
//		benchmarkCom(vector);
//		
//		System.out.print("Linked list: ");
//		List<Onibus> linkedList = new LinkedList<>();
//		benchmarkCom(linkedList);
//		
		System.out.print("Array list: ");
		List<Onibus> arrayList = new ArrayList<>();
		benchmarkCom(arrayList);
//		
//		System.out.print("Tree set: ");
//		Set<Onibus> treeSet = new TreeSet<>();
//		benchmarkCom(treeSet);
//
//		System.out.print("Hash set: ");
//		Set<Onibus> hashSet = new HashSet<>();
//		benchmarkCom(hashSet);
	}

	private static void benchmarkCom(Collection<Onibus> onibuses) {
//		// cria os onibuses que passam em um ponto
//		for(int i = 0; i < 8500000; i++) {
//			onibuses.add(new Onibus(i + "/10", "onibus linha " + i));
//		}
//		PontoDeOnibus ponto = new PontoDeOnibus("Ponto final", new Coordenada(-23.546756,-46.630302), onibuses);
//		
//		// busca cada uma das linhas de um a dez mil (sem o /10)
//		long inicio = System.currentTimeMillis();
//		for(int i = 1; i < 10000; i++) {
//			ponto.passa(new Onibus(i + "/10", ""));
//		}
//		long fim = System.currentTimeMillis();
//		System.out.println("calculado em " + (fim - inicio) + " milissegundos");
	}
}
