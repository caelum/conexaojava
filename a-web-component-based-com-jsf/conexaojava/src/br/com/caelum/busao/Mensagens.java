package br.com.caelum.busao;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class Mensagens {

	public static void adicionaGlobal(String msg){
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(msg));		
	}
}
