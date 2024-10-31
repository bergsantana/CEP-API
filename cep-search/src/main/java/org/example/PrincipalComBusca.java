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
        // String endereco = "";
        Search buscador = new Search();


        while (!busca.equalsIgnoreCase("sair")){

            System.out.println("Digite um CEP para buscar: ");
            busca = leitura.nextLine();

           //  endereco =  "https://viacep.com.br/ws/" + busca + "/json";

            System.out.println("Buscando - " + busca);

            try {

                String body = buscador.getDetailsFromCep(busca);
                System.out.println("Body" + body);

                SaveLocally saveLocally = new SaveLocally(busca);


                saveLocally.SaveAddressAsJson(body);


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