package org.example.modelo;

import com.google.gson.annotations.SerializedName;

public record EnderecoDTO(
        String cep,
        String logradouro,
        String cidade,
        String bairro,
        String uf,
        String complemento
) { }
