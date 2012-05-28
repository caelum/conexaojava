package br.com.caelum.map;

import java.util.List;

import br.com.caelum.activity.R;
import br.com.caelum.modelo.Coordenada;
import br.com.caelum.modelo.Onibus;

import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.Overlay;

public class Itinerario {
	private final MapActivity activity;

	public Itinerario(MapActivity activity) {
		this.activity = activity;
	}

	public MapView criaMapaPara(Onibus onibus) {
		MapView mapa = (MapView) activity.findViewById(R.id.mapa);
		
		mapa.setClickable(true);
		mapa.displayZoomControls(true);
		mapa.setBuiltInZoomControls(true);
		
		PontosOverlay pontosOverlay = new PontosOverlay(activity);
		pontosOverlay.set(onibus);
		
		List<Overlay> overlays = mapa.getOverlays();
		overlays.add(pontosOverlay);

		Coordenada primeiroPonto = onibus.getPontos().get(0).getLocalizacao();
		
		MapController controller = mapa.getController();
		controller.setZoom(17);
		controller.setCenter(primeiroPonto.toGeoPoint());
		controller.animateTo(primeiroPonto.toGeoPoint());
		
		return mapa;
	}
}
