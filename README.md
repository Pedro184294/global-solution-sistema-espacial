# Global Solution - Sistema Espacial

## Descrição do Projeto

Este projeto foi desenvolvido para o Global Solution da disciplina de Programação Orientada a Objetos.

O sistema simula uma plataforma de monitoramento espacial, utilizando conceitos fundamentais de orientação a objetos em Java.

O objetivo do projeto é monitorar componentes espaciais, sensores e sistemas de propulsão, permitindo o acompanhamento do funcionamento de satélites e coleta de dados da missão.

---

## Funcionalidades

- Monitoramento de satélites
- Sistema de propulsão espacial
- Sensores de temperatura
- Sensores de pressão
- Coleta de dados da missão
- Exibição do status operacional
- Arquitetura orientada a objetos

---

## Conceitos de POO Aplicados

### Abstração
Utilização da classe abstrata `ComponenteEspacial`.

### Encapsulamento
Proteção de atributos na classe `DadosMissao`.

### Herança
A classe `Satelite` herda da classe `ComponenteEspacial`.

### Polimorfismo
Uso de métodos sobrescritos em sistemas de propulsão e sensores.

### Interfaces
Criação da interface `Sensor`.

---

## Estrutura do Projeto

src/
└── br/com/espacial/
    ├── ComponenteEspacial.java
    ├── Sensor.java
    ├── SensorTemperatura.java
    ├── SensorPressao.java
    ├── DadosMissao.java
    ├── SistemaPropulsao.java
    ├── PropulsaoQuimica.java
    ├── Satelite.java
    └── SistemaMonitoramento.java


# Código Comentado

O código foi desenvolvido utilizando boas práticas de Programação Orientada a Objetos, contendo comentários explicativos nas principais partes do sistema para facilitar o entendimento da lógica implementada.

Os comentários descrevem:

- funcionamento dos sensores
- ativação do sistema de propulsão
- abstração das classes
- implementação da interface
- encapsulamento dos dados da missão
- Printscreen do Sistema Funcionando
- Execução do Sistema no Eclipse

# Execução do sistema no Eclipse

<img width="263" height="139" alt="Captura de tela 2026-05-29 100844" src="https://github.com/user-attachments/assets/d4a81acb-95ed-4994-bea1-4f6964d0450f" />


Exemplo esperado no console:

===== SISTEMA ESPACIAL =====

Satelite: Hubble
Status: Operacional

Sistema de propulsão química ativado!

Coletando dados de temperatura...
Coletando dados de pressão...

Temperatura: 25.0
Pressão: 1.5
Evidências do Projeto

Inserir:


<img width="320" height="372" alt="image" src="https://github.com/user-attachments/assets/f63dfb00-f338-4684-84bd-f94008b36de7" />

print da estrutura do projeto
print do GitHub com os arquivos enviados
print do console executando o sistema

# Conclusão

O projeto permitiu aplicar os principais conceitos de Programação Orientada a Objetos utilizando Java, incluindo:

- abstração
- encapsulamento
- herança
- polimorfismo
- interfaces

Além disso, foi possível desenvolver uma arquitetura organizada simulando um sistema real de monitoramento espacial.
