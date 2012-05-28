package br.com.caelum.busao;

import java.util.Collection;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.map.PointSelectEvent;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Marker;

@ManagedBean
@ViewScoped
public class OnibusBean {
	
	private Onibus onibus = new Onibus();
	private MapModel mapaDosPontos = new DefaultMapModel();
	
	public Onibus getOnibus() {
		return onibus;
	}
	
	public void grava() {		
		NaoEhOBancoDeDadosDosOnibus.adiciona(onibus);
		limpaFormulario();
	}
	
	public void novoPonto(PointSelectEvent pointSelectEvent) {
		LatLng latLng = pointSelectEvent.getLatLng();
		//Pode melhor JEDI?
		Ponto ponto = new Ponto(latLng.getLat(),latLng.getLng());
		onibus.adiciona(ponto);
		Marker marker = new Marker(latLng);
		mapaDosPontos.addOverlay(marker);
		
		
	}
	
	public MapModel getMapaDosPontos() {
		return this.mapaDosPontos;
	}
	
	private void limpaFormulario() {
		this.onibus = new Onibus();
	}

	public Collection<Onibus> getLista() {
		return NaoEhOBancoDeDadosDosOnibus.lista();
		
	}

}
