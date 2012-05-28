package br.com.caelum.modelo;

import com.google.android.maps.GeoPoint;

public class Coordenada {
	private static final double CONVERSION_SCALE = 1E6;
	private double latitude;
	private double longitude;
	
	public Coordenada(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public GeoPoint toGeoPoint() {
		Double geoLat = this.latitude  * CONVERSION_SCALE;
		Double geoLng = this.longitude * CONVERSION_SCALE;
		
		return new GeoPoint(geoLat.intValue(), geoLng.intValue());
	}	
	
	@Override
	public String toString() {
		return "("+latitude+", "+longitude+")";
	}
	
	public double getLatitude() {
		return latitude;
	}
	public double getLongitude() {
		return longitude;
	}
}
