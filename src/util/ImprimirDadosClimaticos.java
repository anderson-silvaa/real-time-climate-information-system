package src.util;

import src.model.DadosClimaticos;

public class ImprimirDadosClimaticos {
     public static void imprimir(DadosClimaticos dados) {
        System.out.println("Informações Meteorológicas para " + dados.cidade + ", " + dados.pais);
        System.out.println("Data e Hora: " + dados.dataHora);
        System.out.println("Temperatura Atual: " + dados.temperaturaAtual + "°C");
        System.out.println("Sensação Térmica: " + dados.sensacaoTermica + "°C");
        System.out.println("Condição do Tempo: " + dados.condicaoTempo);
        System.out.println("Umidade: " + dados.umidade + "%");
        System.out.println("Velocidade do Vento: " + dados.velocidadeVento + " km/h");
        System.out.println("Pressão Atmosférica: " + dados.pressaoAtmosferica + " mb");
    }
}
