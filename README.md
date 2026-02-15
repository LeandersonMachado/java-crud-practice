[README.md](https://github.com/user-attachments/files/25324976/README.md)
# 📚 Java Backend Essentials: CRUD de Livros em Console

Este projeto foi desenvolvido como o primeiro passo no estudo de Java focado em Backend, seguindo a metodologia de dominar os conceitos fundamentais antes de avançar para frameworks como o Spring Boot.

A aplicação é um **CRUD (Create, Read, Update, Delete)** de Livros executado via console, utilizando a organização manual em camadas para simular uma arquitetura robusta.

---

## Foco e Conceitos Implementados

O projeto reforça os seguintes pilares do Java moderno:

### 1. Fundamentos de POO e Estrutura
* **Classes, Objetos e Construtores:** Implementados na classe `Livro` (`model`).
* **Organização em Camadas:** Estrutura clara em `model/`, `repository/`, `service/`, e `controller/` (simulado pela `App.java`).

### 2. Coleções e Persistência em Memória
* **Collection API (`List<Livro>`):** Utilizada no `LivroRepository` para simular um banco de dados em memória.
* **Padrão Repository:** Camada responsável pela manipulação dos dados (CRUD).

### 3. Regras de Negócio e Fluxo de Aplicação
* **Camada Service:** Responsável por encapsular as regras de negócio, como validação de existência de um ID antes de operações de **Update** e **Delete**.
* **Fluxo de Chamadas:** `Controller` → `Service` → `Repository`.

---

## 🛠️ Como Executar

1.  **Pré-requisitos:** Java 17+ e IDE (Eclipse, IntelliJ, etc.).
2.  **Clonar o Repositório:** `git clone https://github.com/LeandersonAraujo/java-backend-essentials-crud.git`
3.  **Importar:** Importe o projeto no seu IDE como um Projeto Maven existente.
4.  **Executar:** Execute a classe principal `App.java` para rodar o fluxo completo do CRUD no console.
