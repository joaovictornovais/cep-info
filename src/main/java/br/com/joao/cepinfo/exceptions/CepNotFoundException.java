package br.com.joao.cepinfo.exceptions;

public class CepNotFoundException extends RuntimeException{

    public CepNotFoundException(String message) {
        super(message);
    }

}
