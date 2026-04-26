import org.json.JSONObject;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
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
