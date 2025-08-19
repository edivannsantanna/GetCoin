package br.com.alura.getcoin;

import br.com.alura.getcoin.modelos.BuscaCoin;
import br.com.alura.getcoin.modelos.Coin;
import br.com.alura.getcoin.modelos.ConverterCoin;
import br.com.alura.getcoin.modelos.ParDeConversao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrincipalBuscaCoin {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        BuscaCoin buscaCoin = new BuscaCoin();
        ConverterCoin converterCoin = new ConverterCoin();

        while (true) {
            System.out.println(
                    """
                            *************************************************
                            Seja bem-vindo(a) ao Conversor de Moedas
                            
                            1. Dólar Americano =>> Real Brasileiro
                            2. Real Brasileiro =>> Dólar Americano
                            3. Dólar Americano =>> Euro
                            4. Euro =>> Dólar Americano
                            5. Dólar Americano =>> Yuan Chinês
                            6. Yuan Chinês =>> Dólar Americano
                            7. Sair
                            Escolha uma opção válida:
                            *************************************************
                            """);
            try {
                var opcao = leitura.nextInt();
                if (opcao == 7) {
                    break;
                }
                ParDeConversao parDeConversao = converterCoin.retorneParConversao(opcao);

                Coin novaCoin = buscaCoin.buscaCoin(parDeConversao.baseCoin());
                System.out.println("digite o valor que deseja conveter:");
                double valor = leitura.nextDouble();
                double valorConvertido = converterCoin.converterCoin(novaCoin, valor, parDeConversao.targetCoin());
                System.out.printf("O valor de %.2f [%s] corresponde ao valor final de =>>> %.2f [%s]%n%n",
                        valor, parDeConversao.baseCoin(), valorConvertido, parDeConversao.targetCoin());

            } catch (InputMismatchException e) {
                System.out.println("Erro: Por favor, digite um número válido para a opção.");
                leitura.next();
            } catch (RuntimeException e) {
                System.out.println("Ocorreu um erro: " + e.getMessage());
                System.out.println("Por favor, tente novamente.\n");
            }
        }
        leitura.close();
        System.out.println("O programa finalizou corretamente!");
    }
}
