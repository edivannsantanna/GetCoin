package br.com.alura.getcoin.modelos;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscaCoin {

    public Coin buscaCoin(String coin) {
        var endereco = "https://v6.exchangerate-api.com/v6/f51bcdc7b7bd00aac9b04590/latest/" + coin;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Coin.class);
        }catch (IOException | InterruptedException e) {
            throw new RuntimeException ("Não consegui obter o endereço dessa moeda.");
        }
    }
}
