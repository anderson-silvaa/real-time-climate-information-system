# 🌤️ Real Time Climates Information System

Aplicação Java de linha de comando que consulta dados meteorológicos em tempo real de qualquer cidade do mundo, utilizando a [WeatherAPI](https://www.weatherapi.com/).

---

## 📋 Sobre o Projeto

Este projeto foi desenvolvido como parte do curso de Java com o objetivo de praticar conceitos como consumo de APIs REST, manipulação de dados JSON e interação com o usuário via terminal.

O usuário informa o nome de uma cidade e a aplicação retorna as condições climáticas atuais de forma clara e formatada.

---

## ✨ Funcionalidades

- 🔎 Busca de dados meteorológicos por nome de cidade ou estado
- 🌡️ Exibição de temperatura atual e sensação térmica
- 🌥️ Condição do tempo (ex: Clear, Cloudy, Rain)
- 💧 Umidade relativa do ar
- 💨 Velocidade do vento
- 🔵 Pressão atmosférica
- 📅 Data e hora local da cidade consultada

---

## 🖥️ Demonstração

```
Digite o nome da cidade: Itu
Informações Meteorológicas para Itu, Brazil
Data e Hora: 2024-06-14 22:00
Temperatura Atual: 15.7°C
Sensação Térmica: 15.7°C
Condição do Tempo: Clear
Umidade: 62%
Velocidade do Vento: 7.2 km/h
Pressão Atmosférica: 1020.0 mb
```

---

## 🚀 Como Executar

### Pré-requisitos

- [Java JDK 22+](https://www.oracle.com/java/technologies/downloads/) instalado
- Chave de API gratuita da [WeatherAPI](https://www.weatherapi.com/)

### Passo a passo

1. Clone o repositório:
```bash
git clone https://github.com/anderson-silvaa/real-time-climate-information-system.git
cd real_time_climate_information_system
```

2. Crie o arquivo com a sua chave de API na raiz do projeto:
```
api-key.txt
sua_chave_aqui
```

3. Compile o projeto:
```bash
javac -cp lib/json-20230618.jar src/Main.java src/model/DadosClimaticos.java src/service/ServicoClimatico.java src/util/ImprimirDadosClimaticos.java -d bin
```

4. Execute:
```bash
java -cp "bin;lib/json-20230618.jar" src.Main
```

> **Mac/Linux:** substitua `;` por `:` no comando de execução.

---

## 🛠️ Tecnologias Utilizadas

| Tecnologia | Descrição |
|---|---|
| Java 22 | Linguagem principal |
| WeatherAPI | API de dados meteorológicos |
| HttpClient | Requisições HTTP nativas do Java |
| org.json | Parsing da resposta da API |

---

## 📁 Estrutura do Projeto

```
real_time_climate_information_system/
│
├── src/
│   ├── Main.java                          # Ponto de entrada da aplicação
│   ├── model/
│   │   └── DadosClimaticos.java           # Modelo de dados meteorológicos
│   ├── service/
│   │   └── ServicoClimatico.java          # Comunicação com a WeatherAPI
│   └── util/
│       └── ImprimirDadosClimaticos.java   # Exibição dos dados no terminal
│
├── bin/                                   # Classes compiladas (gerado automaticamente)
├── lib/
│   └── json-20230618.jar                  # Biblioteca org.json
│
├── api-key.txt                            # Ignorado pelo .gitignore
├── .gitignore
└── README.md
```

---

## 📚 Aprendizados

- Consumo de APIs REST com Java puro
- Parsing e manipulação de respostas JSON
- Organização de projeto em camadas (model, service, util)
- Separação de responsabilidades em classes distintas
- Boas práticas com variáveis de ambiente e configurações sensíveis

---

## 👨‍💻 Autor

Feito com ☕ durante o curso de Java.

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/anderson-silvas)
[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/anderson-silvaa)
