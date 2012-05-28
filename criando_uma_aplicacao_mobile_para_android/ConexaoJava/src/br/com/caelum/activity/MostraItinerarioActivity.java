package br.com.caelum.activity;

import android.os.Bundle;
import android.widget.TextView;
import br.com.caelum.dao.OnibusRepository;
import br.com.caelum.map.Itinerario;
import br.com.caelum.modelo.Onibus;

import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;

public class MostraItinerarioActivity extends MapActivity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mapa_itinerario);

		Onibus onibus = new OnibusRepository().daLinha("1786-10");
		
		TextView titulo = (TextView) findViewById(R.id.titulo);
		titulo.setText(onibus.getNome());
		
		MapView mapa = new Itinerario(this).criaMapaPara(onibus);
		
		mapa.invalidate();
	}

	@Override
	protected boolean isRouteDisplayed() {
		return false;
	}
}