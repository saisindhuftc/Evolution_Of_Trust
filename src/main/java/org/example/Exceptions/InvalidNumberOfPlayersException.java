package org.example.Exceptions;

public class InvalidNumberOfPlayersException extends RuntimeException {
    public InvalidNumberOfPlayersException(String message) {
        super(message);
    }
}
