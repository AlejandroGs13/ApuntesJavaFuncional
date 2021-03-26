package com.sower.funtional;

import java.util.Optional;

public class OptionalApp {

    public void probar(String valor){
//        System.out.println(valor.contains("sower"));
        Optional op = Optional.empty();
        op.get();
    }

    public void orElse(String valor){
        Optional<String> op = Optional.ofNullable(valor);//Para utilizar orElse debemos igualar el valor a ofNullable
        System.out.println(op.orElse("Esto esta nullo chamo"));//orElse en caso que llegue una variable nula porder cambiarla a un valor no nulo
    }

    public void orElseThrow(String valor){
        Optional<String> op = Optional.ofNullable(valor);//Para utilizar orElse debemos igualar el valor a ofNullable
        op.orElseThrow(NumberFormatException::new);
    }

    public void isPresent(String valor){
        Optional<String> op = Optional.ofNullable(valor);//Para utilizar orElse debemos igualar el valor a ofNullable
        System.out.println(op.isPresent());
    }

    public static void main(String[] args) {
        OptionalApp app = new OptionalApp();
//        app.probar("Mito");
        app.isPresent(null);
    }
}
