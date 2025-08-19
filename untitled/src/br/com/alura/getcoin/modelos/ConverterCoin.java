package br.com.alura.getcoin.modelos;

public class ConverterCoin {

    public ParDeConversao retorneParConversao(int opcao) {
        switch (opcao) {
            case 1:
                return new ParDeConversao("USD", "BRL");
            case 2:
                return new ParDeConversao("BRL", "USD");
            case 3:
                return new ParDeConversao("USD", "EUR");
            case 4:
                return new ParDeConversao("EUR", "USD");
            case 5:
                return new ParDeConversao("USD", "CNY");
            case 6:
                return new ParDeConversao("CNY", "USD");
            default:
                throw new IllegalArgumentException("Opção inválida: " + opcao);
        }
    }
    public double converterCoin(Coin coin, double valor, String parDeConversao) {
        double taxa = 0;
        switch (parDeConversao) {
            case "USD":
                taxa = coin.conversion_rates().USD();
                break;
            case "EUR":
                taxa = coin.conversion_rates().EUR();
                break;
            case "BRL":
                taxa = coin.conversion_rates().BRL();
                break;
            case "CNY":
                taxa = coin.conversion_rates().CNY();
                break;
            default:
                throw new IllegalArgumentException("Moeda de conversão inválida: " + parDeConversao);
        }
        return valor * taxa;
    }
}
