# 📚 Sistema de Livraria

> Sistema de console (CLI) em Java para gerenciar o empréstimo de livros de uma biblioteca.
> Projeto desenvolvido como desafio prático da [Rocketseat](https://www.rocketseat.com.br/), com foco em **Programação Orientada a Objetos**.

<p align="left">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java"/>
  <img src="https://img.shields.io/badge/Categoria-Backend-2C2C2C?style=for-the-badge" alt="Backend"/>
  <img src="https://img.shields.io/badge/Nível-Iniciante-3FB950?style=for-the-badge" alt="Iniciante"/>
  <img src="https://img.shields.io/badge/Interface-CLI-blueviolet?style=for-the-badge" alt="CLI"/>
  <img src="https://img.shields.io/badge/Paradigma-POO-orange?style=for-the-badge" alt="POO"/>
</p>

---

## 📖 Sobre o projeto

Este projeto é um sistema básico para gerenciar o **empréstimo de livros** em uma biblioteca.
O foco está na **listagem de livros disponíveis** e na **funcionalidade de empréstimo**, colocando em prática conceitos de classes, objetos, listas e interação com o usuário via terminal.

---

## 🎯 Objetivo

Desenvolver um sistema de console que interage com o usuário, permitindo que ele:

- 👀 Veja a lista de livros disponíveis;
- 📕 Realize o empréstimo de um livro pelo `id`.

---

## ⚙️ Como funciona

O programa roda em **loop**, seguindo este fluxo:

1. **Início** — O sistema pergunta ao usuário se ele deseja ver a lista de livros disponíveis.
2. **Listagem** — Se a resposta for **`SIM`**, exibe no console todos os livros que **ainda não foram emprestados**.
3. **Empréstimo** — Após ver a lista, o usuário escolhe um livro pelo `id`, informa o próprio nome e registra o empréstimo. O sistema confirma com uma mensagem de sucesso e marca o livro como **indisponível**.
4. **Encerramento** — Se a resposta inicial for **`NÃO`**, ou após a conclusão de um empréstimo, o sistema exibe uma mensagem de despedida e finaliza a execução.

```text
┌─────────────────────────────────────────────┐
│  Deseja ver a lista de livros? (SIM/NÃO)     │
└─────────────────────────────────────────────┘
        │                          │
       SIM                        NÃO
        │                          │
        ▼                          ▼
  Lista os livros           Mensagem de
  disponíveis               despedida → FIM
        │
        ▼
  Escolhe o id + nome
        │
        ▼
  Empréstimo registrado ✅
  (livro fica indisponível)
        │
        ▼
  Mensagem de despedida → FIM
```

---

## 🗂️ Estrutura do projeto

O projeto é dividido em classes simples para manter a organização e respeitar o princípio da **responsabilidade única**:

```
src/
├── model/
│   └── Livro.java          # Representa um livro (id, título, autor, disponibilidade)
├── service/
│   └── Biblioteca.java     # Regras de negócio: listar disponíveis e emprestar
└── Main.java               # Ponto de entrada: loop e interação com o usuário
```

| Classe         | Responsabilidade                                                                 |
|----------------|----------------------------------------------------------------------------------|
| `Livro`        | Modela um livro com atributos `id`, `titulo`, `autor` e `disponivel`.            |
| `Biblioteca`   | Guarda a lista de livros e contém os métodos para listar disponíveis e emprestar.|
| `Main`         | Controla o fluxo do programa, o loop e a leitura das entradas do usuário.         |

> 💡 A interface com o usuário (`Main`) é separada da lógica (`Biblioteca`), o que facilita futuras evoluções — como trocar o terminal por uma interface gráfica sem reescrever as regras de negócio.

---

## 🚀 Como executar

> Pré-requisito: **JDK 17+** instalado (`java -version` para conferir).

```bash
# 1. Clone o repositório
git clone https://github.com/seu-usuario/sistema-livraria.git

# 2. Acesse a pasta
cd sistema-livraria

# 3. Compile os arquivos
javac -d bin src/model/*.java src/service/*.java src/Main.java

# 4. Execute
java -cp bin Main
```

---

## 🧠 Conceitos aplicados

- ✅ **Classes e objetos** — modelagem do `Livro` e da `Biblioteca`.
- ✅ **Encapsulamento** — atributos privados acessados por *getters* e *setters*.
- ✅ **Coleções (`List` / `ArrayList`)** — armazenamento dinâmico dos livros.
- ✅ **Estruturas de controle** — laços (`while`) e condicionais (`if/else`).
- ✅ **Entrada de dados** — leitura via `Scanner`.

---

## 🔮 Possíveis melhorias

- [ ] Permitir a **devolução** de livros.
- [ ] Adicionar e remover livros pelo menu.
- [ ] Persistir os dados em arquivo (`JSON`) ou banco de dados (`SQLite`).
- [ ] Tratar entradas inválidas com `try/catch`.
- [ ] Criar testes unitários com **JUnit**.

---

## 👨‍💻 Autor

Feito com dedicação por **João Pedro** 🚀

<p align="left">
  <a href="https://github.com/seu-usuario" target="_blank">
    <img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white" alt="GitHub"/>
  </a>
</p>

---

<p align="center">
  ⭐ Se este projeto te ajudou de alguma forma, deixe uma estrela no repositório!
</p>
