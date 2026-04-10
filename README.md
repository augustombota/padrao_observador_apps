# Monitorização de Desempenho com Observer Pattern

## Descrição do Projeto

Este projeto foi desenvolvido em Java com o objetivo de demonstrar a aplicação do padrão de projeto **Observer Pattern** na monitorização de eventos em tempo real.

O sistema simula um semáforo que altera o seu estado e notifica automaticamente todos os carros (observadores), que reagem de acordo com o estado recebido.

---

## Objetivo

O principal objetivo deste projeto é mostrar como diferentes componentes de um sistema podem comunicar entre si de forma automática, sem estarem fortemente dependentes uns dos outros.

Também foi aplicado o conceito de monitorização de eventos, onde mudanças no sistema são imediatamente comunicadas aos observadores.

---

## Funcionalidades

- Simulação de um semáforo com três estados:
  - VERDE
  - AMARELO
  - VERMELHO

- Carros que reagem automaticamente às mudanças do semáforo:
  - VERDE → Avançar
  - AMARELO → Reduzir velocidade
  - VERMELHO → Parar

- Notificação automática de todos os observadores

- Sistema de menu interativo no terminal

- Tratamento de entradas inválidas:
  - Se o utilizador escolher uma opção que não existe no menu → o sistema mostra mensagem de erro e aguarda **3 segundos**
  - Se o utilizador digitar um carácter inválido (ex: letras) → o sistema mostra mensagem de erro e aguarda **5 segundos**

---

## Conceitos Aplicados

- Observer Pattern (Padrão de Projeto)
- Programação Orientada a Objetos (POO)
- Interfaces em Java
- Estruturas de dados (List)
- Tratamento de erros de entrada do utilizador
- Comunicação entre objetos

---

## Estrutura do Projeto
monitorizacao-observer-pattern/
│
├── src/
│   └── monitorizacao/
│       ├── Main.java        → Execução do sistema (menu e interação)
│       ├── Semaforo.java    → Classe principal (Subject)
│       ├── Carro.java       → Observadores concretos
│       └── Observer.java    → Interface do padrão Observer
│
├── relatorio/
│   └── relatorio.docx      → Documento Word do trabalho
|
├── README.md              → Descrição do projeto
│
└── .gitignore             → Ficheiros ignorados pelo Git
