package com.sower.funtional;

public class CheckUnCheck {


    public static double dividirCheck(double a, double b) throws Exception {
        if (b == 0) {
            throw new Exception("El argumento b no puede ser 0");
        }

        return a / b;
    }

    public static double dividirUnCheck(double a, double b) {
        if (b == 0) {
            throw new RuntimeException("El argumento b no puede ser 0");
        }

        return a / b;
    }


    public static void main(String[] args) {

        try {
            System.out.println("1.-"+dividirCheck(12,0));
        } catch (Exception exception) {
            System.out.println("Exception :"+exception.getMessage());
        }

        System.out.println("2.-"+dividirUnCheck(12,0));


    }
}
