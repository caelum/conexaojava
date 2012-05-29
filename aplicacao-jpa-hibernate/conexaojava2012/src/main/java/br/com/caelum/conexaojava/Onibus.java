package br.com.caelum.conexaojava;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;


@Entity
public class Onibus {

	private CPF cpf;

	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	@Length(min= 4)
	private String linha;

	@Length(min= 14)
	private String nome;

	@ManyToMany(mappedBy = "onibuses")
	private List<PDOnibus> pontos = new ArrayList<PDOnibus>();

	public Onibus() {
	}

	public Onibus(String name, String linha) {
		this.nome = name;
		this.linha = linha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLinha() {
		return linha;
	}

	public Long getId() {
		return id;
	}

}
