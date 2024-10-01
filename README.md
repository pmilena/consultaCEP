# Aplicação de Consulta de CEP

Este projeto é uma aplicação Java simples para consultar informações de endereço com base no CEP. A aplicação permite que o usuário insira um CEP, faz a consulta em uma API externa, e retorna informações como logradouro, bairro, cidade, estado e UF. Os dados retornados são então armazenados em um arquivo JSON.

## Funcionalidades

- Consulta informações de endereço usando um CEP fornecido pelo usuário.
- Exibe as informações de logradouro, bairro, cidade, estado e UF.
- Armazena os dados retornados em um arquivo `.json` para fins de registro.

## Tecnologias Utilizadas

- Biblioteca Gson para manipulação de JSON
- API HTTP do Java (`java.net.http.HttpClient`)
- Scanner para entrada de dados do usuário

### Pré-requisitos

- JDK 11 ou superior instalado na sua máquina
- Conexão à Internet para realizar as consultas de CEP
- Uma API pública de CEP (como a [ViaCEP](https://viacep.com.br/)) para consulta de dados de endereço
