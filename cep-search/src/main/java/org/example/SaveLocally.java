package org.example;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.modelo.Endereco;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SaveLocally {
    private Gson gson;
    private FileWriter fileWriter;

    SaveLocally(String cep) throws IOException{
        this.gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
        this.fileWriter = new FileWriter(cep + ".json");
    }

    public void SaveAddressAsJson(String endereco) throws IOException {

        fileWriter.write(gson.toJson(endereco));
        fileWriter.close();

        System.out.println("Enderecos salvo com sucesso");
    }

    public Gson getGson() {
        return gson;
    }

}
