package src.service;

import org.json.JSONObject;

import src.model.DadosClimaticos;

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ServicoClimatico {
    public DadosClimaticos getDadosClimaticos(String cidade) throws Exception {
        String apiKey = Files.readString(Paths.get("Api_Key.txt")).trim();
        String formataNomeCidade = URLEncoder.encode(cidade, StandardCharsets.UTF_8);
        String apiUrl = "http://api.weatherapi.com/v1/current.json?key=" + apiKey + "&q=" + formataNomeCidade;

        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(apiUrl))
            .build();

        HttpClient cliente = HttpClient.newHttpClient();
        HttpResponse<String> response = cliente.send(request, HttpResponse.BodyHandlers.ofString());

        String dados = response.body();

        if (dados.contains("\"code\":1006")) {
            return null;
        }

        JSONObject dadosJson = new JSONObject(dados);
        JSONObject current = dadosJson.getJSONObject("current");

        DadosClimaticos dc = new DadosClimaticos();
        dc.cidade = dadosJson.getJSONObject("location").getString("name");
        dc.pais = dadosJson.getJSONObject("location").getString("country");
        dc.dataHora = current.getString("last_updated");
        dc.temperaturaAtual = current.getFloat("temp_c");
        dc.sensacaoTermica = current.getFloat("feelslike_c");
        dc.condicaoTempo = current.getJSONObject("condition").getString("text");
        dc.umidade = current.getInt("humidity");
        dc.velocidadeVento = current.getFloat("wind_kph");
        dc.pressaoAtmosferica = current.getFloat("pressure_mb");

        return dc;
    }
}
