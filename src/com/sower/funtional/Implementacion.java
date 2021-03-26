package com.sower.funtional;

public class Implementacion implements TestEncapsulamiento{

    @Override
    public Double Multiplicar(double x, double y) {
        return null;
    }

    @Override
    public Double Sumar(double x, double y) {
        return null;
    }

    @Override
    public Double Restar(double x, double y) {
        return null;
    }

    public static void main(String[] args) {
        TestEncapsulamiento as = new Implementacion();
        System.out.println(as.Restar(12,4));
        System.out.println(TestEncapsulamiento.dividir(8,2));

    }
}
