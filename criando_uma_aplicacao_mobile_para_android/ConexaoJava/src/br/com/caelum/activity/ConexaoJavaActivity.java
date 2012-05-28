package br.com.caelum.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import br.com.caelum.dao.OnibusRepository;
import br.com.caelum.modelo.Onibus;
import br.com.caelum.modelo.PontoDeOnibus;

public class ConexaoJavaActivity extends Activity {
//	private final String serverUri = "http://10.0.2.2:8080/ConexaoJavaServer/busao/busca"; 
//	private final String param = "linha=501M-10";
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Onibus busao = new OnibusRepository().umOnibus();
//        Onibus busao = new BuscaOnibusTask(serverUri).executaComParametro(param);
        
        TextView titulo = (TextView) findViewById(R.id.titulo);
        titulo.setText(busao.getLinha());
        
        ListView pontos = (ListView) findViewById(R.id.pontos);
        
        ListAdapter adapter = new ArrayAdapter<PontoDeOnibus>(
        						this, R.layout.linha, busao.getPontos());
		pontos.setAdapter(adapter );
		
		View botao = findViewById(R.id.botao);
		botao.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				ConexaoJavaActivity daqui = ConexaoJavaActivity.this;
				Class<?> destino = MostraItinerarioActivity.class;
				
				Intent minhaIntencao = new Intent(daqui, destino);
				
				startActivity(minhaIntencao);
			}
		});
    }
}