package com.campusdual.classroom;

public class Exercise {

    public static int divisionWithCustomException(int dividend, int divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException();
        }
        return dividend / divisor;
    }

    public static void main(String[] args) {
        try {
            divisionWithCustomException(3, 0);
        } catch (DivisionByZeroException e) {
        }
    }
}
