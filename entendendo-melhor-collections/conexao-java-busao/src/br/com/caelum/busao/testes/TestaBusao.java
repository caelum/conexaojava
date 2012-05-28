package br.com.caelum.busao.testes;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.busao.Coordenada;
import br.com.caelum.busao.Onibus;
import br.com.caelum.busao.PontoDeOnibus;

public class TestaBusao {
	public static void main(String[] args) {
		List<Onibus> onibuses = new ArrayList<>();
		onibuses.add(new Onibus("2002/10", "TERMINAL BANDEIRA"));
		onibuses.add(new Onibus("2290/10", "TERMINAL SÃO MATEUS"));
		onibuses.add(new Onibus("5108/10", "JARDIM CELESTE"));
		onibuses.add(new Onibus("5111/10", "TERMINAL SANTO AMARO"));
		onibuses.add(new Onibus("5300/10", "TERMINAL SANTO AMARO"));
		onibuses.add(new Onibus("6403/10", "TERMINAL JOÃO DIAS"));
		onibuses.add(new Onibus("9300/10", "TERMINAL CASA VERDE"));
		onibuses.add(new Onibus("3539/10", "CIDADE TIRADENTES"));
		onibuses.add(new Onibus("3539/10", "TERMINAL CIDADE TIRADENTES"));
		onibuses.add(new Onibus("3539/31", "CIDADE TIRADENTES"));
		onibuses.add(new Onibus("3539/51", "CIDADE TIRADENTES"));
		onibuses.add(new Onibus("3390/10", "TERM. SÃO MATEUS"));
		onibuses.add(new Onibus("3391/10", "TERM. SÃO MATEUS"));
		onibuses.add(new Onibus("4120/10", "BARRO BRANCO"));
		onibuses.add(new Onibus("2666/10", "CAMARGO VELHO"));
		onibuses.add(new Onibus("2678/10", "OLIVEIRINHA"));
		onibuses.add(new Onibus("3160/10", "TERM. VILA PRUDENTE"));
		onibuses.add(new Onibus("2296/10", "JARDIM MARILIA"));
		onibuses.add(new Onibus("3222/10", "JARDIM MARILIA"));
		onibuses.add(new Onibus("2551/10", "TERM. AE CARVALHO"));
		onibuses.add(new Onibus("2552/10", "VILA MARA"));
		onibuses.add(new Onibus("2552/32", "VILA MARA"));
		onibuses.add(new Onibus("2552/41", "JARDIM SÃO MARTINHO"));
		onibuses.add(new Onibus("2003/10", "TERM. PRINCESA ISABEL"));
		onibuses.add(new Onibus("702P/21", "PINHEIROS"));
		onibuses.add(new Onibus("702P/42", "BUTANTÃ"));
		onibuses.add(new Onibus("3462/10", "VILA SANTANA"));
		onibuses.add(new Onibus("3462/41", "JARDIM VILA NOVA"));
		onibuses.add(new Onibus("702U/10", "BUTANTÃ-USP"));
		onibuses.add(new Onibus("702U/21", "PINHEIROS"));
		onibuses.add(new Onibus("2191/10", "SHOPPING ARICANDUVA"));
		onibuses.add(new Onibus("2582/10", "VILA NOVA CURUÇÁ"));
		onibuses.add(new Onibus("2582/21", "VILA ROBERTINA"));
		onibuses.add(new Onibus("2583/10", "VILA CURUÇÁ"));
		onibuses.add(new Onibus("3161/10", "JARDIM COLORADO"));
		onibuses.add(new Onibus("4491/10", "JARDIM ZOOLÓGICO"));
		onibuses.add(new Onibus("475R/10", "JARDIM SÃO SAVÉRIO"));
		onibuses.add(new Onibus("2626/10", "JARDIM NAZARÉ"));
		onibuses.add(new Onibus("3303/10", "PRESTES MAIA"));
		onibuses.add(new Onibus("3354/10", "JARDIM COLONIAL"));
		onibuses.add(new Onibus("3414/10", "VILA DALILA"));
		onibuses.add(new Onibus("3459/10", "ITAIM PAULISTA"));
		onibuses.add(new Onibus("3406/10", "COHAB JUSCELINO"));
		onibuses.add(new Onibus("3407/10", "INÁCIO MONTEIRO"));
		onibuses.add(new Onibus("3574/10", "JARDIM ETELVINA"));
		onibuses.add(new Onibus("702U/10", "BUTANTÃ USP"));
		onibuses.add(new Onibus("5100/10", "PINHEIROS"));
		onibuses.add(new Onibus("3686/10", "JARDIM SÃO PAULO"));
		onibuses.add(new Onibus("4114/10", "VILA GUMERCINDO"));
		onibuses.add(new Onibus("4114/31", "VILA GUMERCINDO"));
		onibuses.add(new Onibus("4221/10", "JARDIM PLANALTO"));
		onibuses.add(new Onibus("4284/10", "VILA CALIFÓRNIA"));
		onibuses.add(new Onibus("4288/10", "PARQUE SANTA MADALENA"));
		onibuses.add(new Onibus("5142/10", "TERMINAL SAPOPEMBA"));
		onibuses.add(new Onibus("5143/10", "TERMINAL SAPOPEMBA"));
		onibuses.add(new Onibus("8615/10", "PARQUE DA LAPA"));

		PontoDeOnibus parqueDomPedro = new PontoDeOnibus("Parque Dom Pedro", 
											new Coordenada(-23.546756,-46.630302), onibuses);
		
		long inicio = System.currentTimeMillis();
		boolean onibusPassa = parqueDomPedro.passa(new Onibus("175T/10", "nao passa la"));
		long fim = System.currentTimeMillis();
		System.out.println(onibusPassa + " calculado em " + (fim - inicio) + " milissegundos");
	}
}
