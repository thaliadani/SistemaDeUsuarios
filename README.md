# Sistema de Gerenciamento de Usuários

Este projeto é uma aplicação Java simples desenvolvida para demonstrar conceitos fundamentais de Orientação a Objetos (OO) e a utilização de recursos modernos da linguagem, especificamente as **Sealed Classes** (Classes Seladas).

## 🚀 Objetivo
O sistema simula o gerenciamento de diferentes tipos de funcionários (Gerente, Vendedor e Atendente) em uma organização, permitindo que cada papel tenha comportamentos e atributos específicos, mantendo uma base comum através da herança.

## 🛠️ Tecnologias Utilizadas
*   **Java 17+**: Necessário para o suporte a `sealed` e `non-sealed` classes.
*   **POO (Programação Orientada a Objetos)**: Abstração, Herança, Encapsulamento e Polimorfismo.

## 🏗️ Estrutura do Projeto

O projeto está organizado da seguinte forma:

1.  **`Pessoa` (Sealed Class)**: A classe base que define os atributos comuns (nome, email, senha) e restringe quem pode herdá-la usando a cláusula `permits`.
2.  **`Gerente`**: Subclasse com privilégios administrativos automáticos e métodos para gerar relatórios e consultar vendas.
3.  **`Vendedor`**: Subclasse focada no controle de volume de vendas.
4.  **`Atendente`**: Subclasse responsável pelas operações de caixa e recebimento de pagamentos.
5.  **`Main`**: Classe de entrada que instancia os objetos e demonstra as funcionalidades de cada papel.

## 🛡️ Conceito de Classes Seladas
Neste projeto, a classe `Pessoa` é definida como `sealed`. Isso significa que temos controle total sobre a hierarquia de classes, garantindo que apenas `Gerente`, `Vendedor` e `Atendente` possam ser "Pessoas" no contexto deste sistema. As subclasses são marcadas como `non-sealed`, permitindo que elas sejam estendidas futuramente se necessário.

## 🚦 Como Executar

1. Certifique-se de ter o **JDK 17** ou superior instalado em sua máquina.
2. Clone o repositório ou baixe os arquivos fonte.
3. Navegue até a pasta `src`.
4. Compile os arquivos:
   ```bash
   javac *.java
   ```
5. Execute a classe principal:
   ```bash
   java Main
   ```

## 📝 Notas de Implementação
*   Os métodos `realizarVenda()` e `receberPagamento()` demonstram lógica de incremento de estado.
*   O sistema utiliza sobrescrita de métodos (`@Override`) para especializar comportamentos da classe pai.
*   A segurança básica é simulada através de atributos de senha e verificação de status de administrador.

---
Desenvolvido como exemplo de estudos em Java.