package br.com.caelum.conexaojava;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class PontoDeOnibus {
	
	@Id
	@GeneratedValue
	private Long id;
	private double latitude, longitude;
	
	@ManyToMany
	private List<Onibus> onibuses = new ArrayList<Onibus>();

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public List<Onibus> getOnibuses() {
		return onibuses;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public void setOnibuses(List<Onibus> onibuses) {
		this.onibuses = onibuses;
	}
	
	

}
