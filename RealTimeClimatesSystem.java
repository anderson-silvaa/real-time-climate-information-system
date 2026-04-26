import org.json.JSONObject;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


public class RealTimeClimatesSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome da cidade: ");
        String cidade = scanner.nextLine(); //Lê cidade inserida

        try {
            String dadosClimaticos = getDadosClimaticos(cidade); //retorna um JSON

            //Código 1006 significa localização não encontrada.
            if (dadosClimaticos.contains("\"code\":1006")) { // \"code\":1006 representa "code:1006"
                System.out.println("Localização não encontrada. Por favor, tente novamente.");
            } else {
                imprimirDadosClimaticos(dadosClimaticos);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

public static String getDadosClimaticos(String cidade) throws Exception {
    String apiKey = Files.readString(Paths.get("Api_Key.txt")).trim();

    String formataNomeCidade = URLEncoder.encode(cidade, StandardCharsets.UTF_8);
    String apiUrl = "http://api.weatherapi.com/v1/current.json?key=" + apiKey + "&q=" + formataNomeCidade;
    HttpRequest request = HttpRequest.newBuilder() //Começa a construção de uma nova solicitação HTTP
        .uri(URI.create(apiUrl)) // Este método define o URI da solicitação HTTP
        .build(); // Finaliza a construção da solicitação HTTP
    
    // Cria objeto enviar solicitações HTTP e receber respostas HTTP, para acessar o site da WeatherAPI
    HttpClient cliente = HttpClient.newHttpClient();

    // Envia requisições HTTP e recebe respostas HTTP - comunicação com o site da API
    HttpResponse<String> response = cliente.send(request, HttpResponse.BodyHandlers.ofString());

    return response.body(); //retorna os dados metereológicos obtidos no site da API (Weather API)
}
