# front-back

> 📦 Projeto de estudo — não recebe mais atualizações.

Versão intermediária (março de 2022) do site de agência de viagens com cadastro de clientes: API REST em Spring Boot + front-end em React, usando MySQL.

## Contexto

Faz parte de uma série de repositórios do mesmo trabalho (agência de viagens com CRUD de clientes, 2022):

| Repositório | Data | O que é |
|---|---|---|
| [projeto-agencia](https://github.com/marcio-sgomes/projeto-agencia) | fev/2022 | Primeira landing page em React (tema Start Bootstrap Grayscale) |
| [Crud-Agencia](https://github.com/marcio-sgomes/Crud-Agencia) | fev/2022 | Primeiro CRUD de clientes em Java Servlets/JSP + JDBC |
| **front-back** | mar/2022 | Versão intermediária (este repositório) |
| [agencia-plus](https://github.com/marcio-sgomes/agencia-plus) | mar/2022 | **Versão final**, com diagramas e script do banco |

## Tecnologias

- **Back-end (`agencia/`)**: Java 17, Spring Boot 2.6 (Web + Data JPA), MySQL Connector, Maven.
- **Front-end (`front/`)**: React 17 (Create React App), Axios.
- **Banco**: MySQL (banco `api_agencia`).

## Estrutura

```
agencia/   API REST Spring Boot (porta 8091, endpoints em /api/cliente)
front/     Site React que consome a API
```

## Como rodar

Pré-requisitos: JDK 17, MySQL e Node.js.

1. Crie no MySQL um banco chamado `api_agencia` (as tabelas são criadas pelo JPA com `ddl-auto=update`).
2. Suba a API informando as credenciais por variáveis de ambiente:
   ```bash
   cd agencia
   cp .env.example .env   # e preencha DB_PASSWORD no .env
   ./mvnw spring-boot:run
   ```
3. Em outro terminal:
   ```bash
   cd front
   npm install
   npm start
   ```
4. Acesse `http://localhost:3000`.
