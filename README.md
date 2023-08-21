# API Java SpringBoot PostgreSQL

A API de Lista de Jogos com Preços é uma aplicação desenvolvida em Java, utilizando o framework Spring Boot, e integração com um banco de dados PostgreSQL. O principal objetivo desta API é permitir aos usuários registrar e gerenciar uma lista de jogos, incluindo seus respectivos preços. A API oferece operações CRUD (Criar, Ler, Atualizar e Deletar) para manipulação dos dados de forma eficiente e escalável.

## Rotas

| ROTA              | HTTP(Verbo) | Descrição         |
| ----------------- | ----------- | ----------------- |
| /game             | GET         | Selecionar Todos  |
| /game             | POST        | Criação           |
| /game/:usuario_id | GET         | Selecionar Por Id |
| /game/:usuario_id | PUT         | Atualizar Por Id  |
| /game/:usuario_id | DELETE      | Excluir Por Id    |

## Requisitos

- Spring Framework
- SpringBoot
- Java
- PostgreSQL

## Parte I: Download & Build

### 1) Clone the repository, install node packages and verify routes locally

```
$git clone git@github.com:PedroArnaldo/APIGameList.git
```

### 2) Build

```
mvn clean install
```
