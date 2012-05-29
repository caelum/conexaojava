package br.com.caelum.conexaojava;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import br.com.caelum.conexaojava.util.BancoDeDados;

public class Programa {
	
	public static void main(String[] args) {
		Session conexao = BancoDeDados.getConexao();
		Transaction transaction = conexao.beginTransaction();
		conexao.createQuery("from Onibus").setMaxResults(15);
//		conexao.createCriteria(Onibus.class).add(Restrictions.ilike("nome", "%udente%")).list();
		
//		List<PontoDeOnibus> pontoses = conexao.createQuery("from PontoDeOnibus where size(onibuses) >= 2").list();
//		List<PontODeOnibus> conexao.createSQLQuery("....");
//		for (PontoDeOnibus p : pontoses) {
//			System.out.println(p.getOnibuses().size());
//		}

//		PontoDeOnibus metro = (PontoDeOnibus) conexao.load(PontoDeOnibus.class, 2L);
//		System.out.println("busquei o metro");
//		for(Onibus o : metro.getOnibuses()) {
//			System.out.println(o.getNome());
//		}
		
//		Onibus itaquerao = new Onibus("Itaquera - Pacaembu", "A514");
//		conexao.save(itaquerao);
//
//		Onibus santana = new Onibus("Santana - Pacaembu", "B514");
//		conexao.save(santana);
//
//		PontoDeOnibus metro = new PontoDeOnibus();
//			metro.setLatitude(1);
//			metro.setLongitude(1);
//			metro.getOnibuses().add(itaquerao);
//			metro.getOnibuses().add(santana);
//			conexao.save(metro);
		
		
		
		
		
//		System.out.println(onibus.getId());
//		onibus.setNome("Vila Marianases");
		
//		List<Onibus> items = conexao.
//				createQuery("from Onibus where nome like :nome").
//				setParameter("nome", "%udente%").
//				list();
//		for (Onibus onibus : items) {
//			System.out.println(onibus.getNome());
//		}

		
//		Onibus busao = (Onibus) conexao.load(Onibus.class, 3L);
//		System.out.println(busao.getNome());

//		Onibus busao2 = (Onibus) conexao.load(Onibus.class, 3L);
//		System.out.println(busao2.getNome());

		
		
		transaction.commit();
		conexao.close();
	}

}









//
//===> falar do cache de 2 nivel (mostrar anotacao)
//
//
// enum
// date time
// many to one
// @NotNull no name