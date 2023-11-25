package org.example.exception;

public class ComprimentoInvalidoException extends RuntimeException {
    public ComprimentoInvalidoException(String mensagem){
        super(mensagem);
    }
}
