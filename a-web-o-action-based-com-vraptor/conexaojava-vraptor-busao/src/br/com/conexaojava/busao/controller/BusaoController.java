package br.com.conexaojava.busao.controller;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import br.com.conexaojava.busao.dao.LinhaDeOnibusDAO;
import br.com.conexaojava.busao.modelo.LinhaDeOnibus;

@Resource
public class BusaoController {
	
	private final Result result;

	public BusaoController(Result result) {
		this.result = result;
	}

	public void busca(String linha) {
		LinhaDeOnibus linhaDeOnibus = new LinhaDeOnibusDAO().daLinha(linha);
		
		// o resultado tem que ser um XML
		result.use(Results.json()).from(linhaDeOnibus).recursive().serialize();
	}
}
