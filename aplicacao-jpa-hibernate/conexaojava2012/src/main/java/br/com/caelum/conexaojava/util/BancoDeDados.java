package br.com.caelum.conexaojava.util;

import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import br.com.caelum.conexaojava.Onibus;
import br.com.caelum.conexaojava.PontoDeOnibus;

@SuppressWarnings("deprecation")
public class BancoDeDados {

	public static Session getConexao() {
		Configuration cfg = new AnnotationConfiguration();
		
		
		// adiciona todas as classes anotadas
		cfg.addAnnotatedClass(Onibus.class);
		cfg.addAnnotatedClass(PontoDeOnibus.class);
		
		
		return cfg.configure().buildSessionFactory().openSession();
	}

}
