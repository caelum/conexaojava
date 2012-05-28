package br.com.caelum.busao;

public final class Coordenada {

	private final double latitude;
	private final double longitude;

	public Coordenada(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}
}
