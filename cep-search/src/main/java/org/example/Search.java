package org.example;

import org.example.modelo.Endereco;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Search  {

    public Search( ) {

    }

    public String getDetailsFromCep(String cep) throws IOException, InterruptedException{

        String req = "https://viacep.com.br/ws/" +
                cep.replace(" ", "")
                + "/json";

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(req))
                    .build();


            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response);
            System.out.println(response.body());
            return response.body();

        } catch (Error e) {
            System.out.println("Um erro ocorreu");
            System.out.println(e.getMessage());

        }
       return "";
    }
}