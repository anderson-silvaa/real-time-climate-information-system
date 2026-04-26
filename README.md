# 🌤️ Weather Forecast CLI

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

- [Java JDK 17+](https://www.oracle.com/java/technologies/downloads/) instalado
- Chave de API gratuita da [WeatherAPI](https://www.weatherapi.com/)

### Passo a passo

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/weather-forecast-cli.git
cd weather-forecast-cli
```

2. Adicione sua chave de API no arquivo de configuração:
```
src/config/config.properties
API_KEY=sua_chave_aqui
```

3. Compile o projeto:
```bash
javac -d bin src/**/*.java
```

4. Execute:
```bash
java -cp bin Main
```

---

## 🛠️ Tecnologias Utilizadas

| Tecnologia | Descrição |
|---|---|
| Java 17 | Linguagem principal |
| WeatherAPI | API de dados meteorológicos |
| HttpURLConnection | Requisições HTTP nativas do Java |
| JSON | Parsing da resposta da API |

---

## 📁 Estrutura do Projeto

```
weather-forecast-cli/
│
├── src/
│   ├── Main.java               # Ponto de entrada da aplicação
│   ├── service/
│   │   └── WeatherService.java # Comunicação com a API
│   ├── model/
│   │   └── WeatherData.java    # Modelo de dados meteorológicos
│   └── config/
│       └── config.properties   # Configurações (API Key)
│
├── .gitignore
└── README.md
```

---

## 📚 Aprendizados

- Consumo de APIs REST com Java puro
- Parsing e manipulação de respostas JSON
- Organização de projeto em camadas (model, service)
- Boas práticas com variáveis de ambiente e configurações sensíveis

---

## 👨‍💻 Autor

Feito com ☕ durante o curso de Java.

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://linkedin.com/in/seu-perfil)
[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/seu-usuario)
