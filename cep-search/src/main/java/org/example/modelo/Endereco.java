package org.example.modelo;

import com.google.gson.annotations.SerializedName;

public class Endereco {
    @SerializedName("CEP")
    private String cep;
    @SerializedName("Logradouro")
    private String logradouro;
    private String cidade;
    private String bairro;
    private String uf;
    private String complemento;


    public Endereco(EnderecoDTO enderecoDTO) {
        this.cep = enderecoDTO.cep();
        this.logradouro = enderecoDTO.logradouro();
        this.cidade = enderecoDTO.cidade();
        this.uf = enderecoDTO.uf();
        this.complemento = enderecoDTO.complemento();
        this.bairro = enderecoDTO.bairro();
    }

    @Override
    public String toString() {
        return "CEP: " + cep + ", cidade " + cidade
                + ", Bairro: " + bairro
                + ", logradouro: " + logradouro
                ;

    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
}
