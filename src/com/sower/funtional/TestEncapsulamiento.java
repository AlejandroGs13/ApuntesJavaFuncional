package com.sower.funtional;

@FunctionalInterface
public interface TestEncapsulamiento {

    Double Multiplicar(double x,double y);

    //Double Sumar(double x,double y);

    default Double Restar(double x,double y){
        return x-y;
    };

    static Double dividir(double x, double y) {
        return x/y;
    }

}
