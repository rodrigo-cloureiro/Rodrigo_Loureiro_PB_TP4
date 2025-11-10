# 🧩 Projeto

## 🚀 Visão Geral

Este projeto é uma aplicação Java Spring Boot integrada com pipelines automatizados via GitHub Actions.
O objetivo é fornecer uma base sólida para desenvolvimento, testes e deploy contínuo.

## 🏗️ Como Executar a Aplicação

### ✅ Pré-requisitos

- Java 21+
- Maven 3.5.6
- Git

### 💻 Como executar a aplicação

#### 1. Clonar o repositório

```bash
git clone https://github.com/rodrigo-cloureiro/Rodrigo_Loureiro_PB_TP4
cd Rodrigo_Loureiro_PB_TP4
```

#### 2. Compilar e executar

```bash
mvn spring-boot:run
```

#### 3. Acessar a aplicação

```bash
http://localhost:8080
```

### ▶️ Como executar e interpretar o workflow

O workflow é acionado automaticamente nos seguintes eventos:

| Evento              | Descrição                                      |
|---------------------|------------------------------------------------|
| `push`              | Quando há push no branch `main`                |
| `pull_request`      | Ao abrir ou atualizar PRs para o branch `main` |
| `workflow_dispatch` | Execução manual pelo GitHub                    |

A pipeline CI/CD está descrita no arquivo *.github/workflows/ci.yml* e é composta por três jobs principais:

### 🧠 1. analyse — Análise com CodeQL

Realiza a análise estática de segurança e qualidade do código.

### Etapas principais:

- Checkout do código
- Configuração do ambiente (JDK 21)
- Inicialização do CodeQL
- Compilação do projeto
- Execução da análise CodeQL

### Resultado esperado:

Identificar vulnerabilidades e problemas de qualidade no código. Os resultados podem ser visualizados na aba Security →
Code scanning alerts do GitHub.

### 🏗️ 2. build — Build e Testes

Executa o build da aplicação e gera os artefatos (.jar).

### Etapas principais:

- Compilação do projeto
- Execução de testes unitários (exceto testes Selenium)
- Geração de relatório de cobertura (JaCoCo)
- Upload dos artefatos (relatório e .jar)

### Relatórios disponíveis:

- target/site/jacoco/index.html — relatório de cobertura de testes
- target/*.jar — pacote final da aplicação

### Interpretação:

Caso o build ou os testes falhem, o workflow exibirá mensagens de erro no log da execução.

### 🚀 3. deploy — Simulação de Deploy

Simula o processo de deploy usando o artefato gerado no job anterior.

### Etapas principais:

- Download do artefato .jar
- Simulação do deploy
- Finalização do processo

### Objetivo:

Garantir que o fluxo de build → artefato → deploy esteja funcional, ainda que o deploy real não ocorra.

## 🛠️ Refatoração

