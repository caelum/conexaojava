package br.com.caelum.busao;

import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.Marker;
import org.primefaces.model.map.Overlay;

public class Ponto {

	private Integer id;
	private String nome;
	private double latitude;
	private double longitude;
	private String descricao;

	public Ponto() {
	}
	
	public Ponto(double latitude,double longitude){
		this.latitude = latitude;
		this.longitude = longitude;
		
	}
	
	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	@Override
	public String toString() {
		return this.latitude + "-" +this.longitude;
	}


}
