package br.com.joao.cepinfo.exceptions;

import feign.Response;
import feign.codec.ErrorDecoder;

public class CustomErrorDecoder implements ErrorDecoder {
    @Override
    public Exception decode(String s, Response response) {
        return switch (response.status()) {
            case 404 -> new CepNotFoundException("informações do CEP fornecido não foram encontradas.");
            default -> new Exception("Houve um erro ao tentar resgatar as informações do CEP fornecido.");
        };
    }
}
