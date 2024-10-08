package org.example;

import org.example.modelo.Endereco;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        String busca = "";
        String endereco = "";
        while (!busca.equalsIgnoreCase("sair")){

            System.out.println("Digite um CEP para buscar: ");
            busca = leitura.nextLine();





            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();


                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                System.out.println(response);
                System.out.println(response.body());

                SaveLocally saveLocally = new SaveLocally();



               // Gson gson = new GsonBuilder()
                //        .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                //        .create();


                // TituloOmdb tituloOmdb = gson.fromJson(response.body(), TituloOmdb.class);
               // System.out.println(tituloOmdb);

            } catch (NumberFormatException e ) {
                System.out.println("Aconteceu um erro");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e ){
                System.out.println("Aconteceu um erro de argumento na busca.");
                System.out.println("Verifique o endereço e tente novamente");
            }
        }








        System.out.println("O produto foi finalizado com sucesso");
    }
}