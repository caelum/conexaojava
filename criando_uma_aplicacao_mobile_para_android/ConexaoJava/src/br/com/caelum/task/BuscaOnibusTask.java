package br.com.caelum.task;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import android.util.Log;
import br.com.caelum.modelo.Onibus;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class BuscaOnibusTask {
	private final String serverUri;

	public BuscaOnibusTask(String serverUri) {
		this.serverUri = serverUri;
	}

	public Onibus executaComParametro(String param) {
		try {
			DefaultHttpClient client = new DefaultHttpClient();
			HttpGet get = new HttpGet(serverUri+"?"+param);

			HttpResponse response = client.execute(get);

			String json = EntityUtils.toString(response.getEntity());

			Log.i("JSON retornado pelo SERVER", "JSON:"+json);
			
			Gson gson = new GsonBuilder().create();
			Onibus busao = gson.fromJson(json, Onibus.class);

			return busao;
		} catch (Exception e) {
			Log.e("ZICA!!", e.toString());
			return new Onibus();
		}
	}
}
