package ru.tinkoff.edu.java.scrapper.exception;

public class LinkNotFoundException extends RuntimeException {

    public LinkNotFoundException() {
    }

    public LinkNotFoundException(String message) {
        super(message);
    }

}
