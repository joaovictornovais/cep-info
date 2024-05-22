package br.com.joao.cepinfo.exceptions;

import br.com.joao.cepinfo.entities.StandardError;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.Instant;

@RestControllerAdvice
public class ExceptionsHandler {

    @ExceptionHandler(CepNotFoundException.class)
    public ResponseEntity<StandardError> cepNotFound(CepNotFoundException e, HttpServletRequest request) {
        StandardError error = new StandardError(
                Instant.now(),
                HttpStatus.NOT_FOUND.value(),
                "Recurso não encontrado",
                e.getMessage(),
                request.getRequestURI()
        );
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }

}
