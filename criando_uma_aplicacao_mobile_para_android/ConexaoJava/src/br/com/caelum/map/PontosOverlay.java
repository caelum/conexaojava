package br.com.caelum.map;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import br.com.caelum.activity.R;
import br.com.caelum.modelo.Onibus;
import br.com.caelum.modelo.PontoDeOnibus;

import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.OverlayItem;

public class PontosOverlay extends ItemizedOverlay<OverlayItem> {
	private List<OverlayItem> overlays = new ArrayList<OverlayItem>();

	public PontosOverlay(Activity activity) {
		super(boundCenter(activity.getResources().getDrawable(R.drawable.ic_bus_stop)));
	}

	@Override
	protected OverlayItem createItem(int i) {
		return overlays.get(i);
	}
	
	public void set(Onibus onibus) {
		for (PontoDeOnibus ponto : onibus.getPontos()) {
			overlays.add(ponto.toOverlayItem());
		}
		populate();
	}

	@Override
	public int size() {
		return overlays.size();
	}
	
	
}
