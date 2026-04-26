package src;

import src.service.ServicoClimatico;
import src.model.DadosClimaticos;
import src.util.ImprimirDadosClimaticos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome da cidade: ");
        String cidade = scanner.nextLine();
        scanner.close();

        try {
            ServicoClimatico servico = new ServicoClimatico();
            DadosClimaticos dados = servico.getDadosClimaticos(cidade);

            if (dados == null) {
                System.out.println("Localização não encontrada. Por favor, tente novamente.");
            } else {
                ImprimirDadosClimaticos.imprimir(dados);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}