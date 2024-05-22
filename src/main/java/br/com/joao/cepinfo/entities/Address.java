package br.com.joao.cepinfo.entities;

import lombok.Data;

@Data
public class Address {
    
    private String bairro;
    private String cidade;
    private String logradouro;
    private StateInfo estado_info;
    private String cep;
    private CityInfo cidade_info;
    private String estado;

    
}
