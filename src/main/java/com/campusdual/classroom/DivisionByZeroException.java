package com.campusdual.classroom;

public class DivisionByZeroException extends Exception {
    public DivisionByZeroException() {
        super();
    }
    public DivisionByZeroException(String message) {
        super(message);
    }
}
