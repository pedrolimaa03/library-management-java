# Library Management System — Java

Projeto desenvolvido em Java com foco em Programação Orientada a Objetos (POO), simulando um sistema de gerenciamento de biblioteca.

---

## Objetivo

Criar um sistema simples de biblioteca capaz de:

- cadastrar clientes
- cadastrar livros
- listar livros disponíveis
- listar clientes cadastrados
- realizar empréstimo de livros
- controlar disponibilidade dos livros

---

## Conceitos Aplicados

Este projeto foi desenvolvido para praticar conceitos fundamentais de backend Java:

- Encapsulamento
- Herança
- Programação Orientada a Objetos (POO)
- Relacionamento 1:N
- ArrayList
- CRUD básico
- Modelagem de domínio
- Organização em múltiplas classes
- Alteração de estado de objetos

---

## Estrutura do Projeto

```text
Biblioteca
 ├── Lista de Livros
 └── Lista de Clientes
```

### Classes do Sistema

- `Pessoa` → classe base
- `Cliente` → herda de Pessoa
- `Livro` → representa livros da biblioteca
- `Biblioteca` → controla listas e empréstimos
- `App` → ponto principal de execução

---

## Funcionalidades

### Cadastro de livros

Permite adicionar livros ao sistema.

### Cadastro de clientes

Permite registrar clientes da biblioteca.

### Listagem

Exibe todos os livros e clientes cadastrados.

### Empréstimo

Permite emprestar um livro.

Quando emprestado:

- disponibilidade muda para `false`
- impede empréstimo duplicado

---

## Tecnologias Utilizadas

- Java
- VS Code
- Git
- GitHub

---

## Exemplo de Saída

```text
=== LISTA INICIAL ===

Biblioteca: Central Books

=== LIVRO ===
Título: Clean Code
Autor: Robert Martin
Páginas: 464
Disponível: true

=== LIVRO ===
Título: Java Efetivo
Autor: Joshua Bloch
Páginas: 419
Disponível: true
```

---

## Aprendizados

Esse projeto foi importante para praticar:

- criação de entidades
- herança
- encapsulamento
- relacionamento entre objetos
- gerenciamento de listas
- lógica de negócio dentro das classes
- pensamento de modelagem backend

---

## Melhorias Futuras

Possíveis evoluções para próximas versões:

- busca de livro por título
- devolução de livro
- busca de cliente
- menu interativo
- tratamento de erros
- persistência de dados
- integração com banco de dados

---

## Autor

Pedro Lima

Projeto criado para evolução em backend Java e construção de portfólio profissional.
