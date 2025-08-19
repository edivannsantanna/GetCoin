
 # GetCoin Conversor de Moedas
​
 ![Java](https://img.shields.io/badge/Java-17-blue?style=for-the-badge&logo=java)
 ![API](https://img.shields.io/badge/API-ExchangeRate-green?style=for-the-badge)
 
​
 Conversor de moedas interativo via console, desenvolvido como parte do desafio do programa **Oracle Next Education (ONE) G8** em parceria com a Alura. A aplicação consulta a API [ExchangeRate-API](https://www.exchangerate-api.com/) para obter as taxas de câmbio em tempo real.
​
 ## ✨ Funcionalidades
​
 -   **Conversão de Moedas**: Converte valores entre um par de moedas selecionado pelo usuário.
 -   **Taxas de Câmbio Atuais**: Utiliza uma API externa para buscar as taxas de conversão mais recentes.
 -   **Interface Interativa**: Menu simples e interativo no console para guiar o usuário.
 -   **Suporte a Diversas Moedas**: Permite a conversão entre as principais moedas globais, como USD, EUR, BRL, ARS, entre outras.
​
 ## 🛠️ Tecnologias Utilizadas
​
 -   **Java 17**
 -   **Java HTTP Client**: Para realizar as requisições à API.
 -   **Gson**: Biblioteca do Google para converter objetos Java em sua representação JSON e vice-versa.
​
 ## ⚙️ Pré-requisitos
​
 Antes de começar, você vai precisar ter instalado em sua máquina:
 -   Java JDK 17 ou superior.
 -   Uma chave de API da [ExchangeRate-API](https://www.exchangerate-api.com/). O plano gratuito é suficiente.
​
 ## 🚀 Como Executar
​
 1.  **Clone o repositório:**
     ```bash
     git clone <url-do-seu-repositorio>
     ```
​
 2.  **Configure a API Key:**
     -   Abra o arquivo `src/br/com/alura/getcoin/modelos/BuscaCoin.java`.
     -   Localize a variável `endereco`.
     -   Substitua `SUA-API-KEY` pela sua chave de API obtida no site da ExchangeRate-API.
     ```java
     // Exemplo de como deve ficar
     String endereco = "https://v6.exchangerate-api.com/v6/SUA-API-KEY/latest/USD";
     ```
​
 3.  **Compile e Execute:**
     -   Compile o projeto usando sua IDE de preferência (IntelliJ, Eclipse, etc.).
     -   Execute a classe `PrincipalBuscaCoin.java`.
     -   Siga as instruções apresentadas no console para realizar as conversões.
