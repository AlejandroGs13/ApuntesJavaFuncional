package com.sower.funtional;

import java.util.Locale;
import java.util.function.Function;

public class FuncionMayor {

    private static Function<String,String> convertirMinusculas = x->x.toLowerCase();
    private static Function<String,String> convertirMayusculas = x->x.toUpperCase();




    public static void  imprimirMOD(Function<String,String> function,String cadena){
        System.out.println(function.apply(cadena));
    }

    private static Function<String,String> returnFunction (String mesage){
        return (String x)->mesage+x;
    }



    public static void main(String[] args) {

        String retorno = returnFunction("HolaQuetal").apply("-CHIDO!");
        System.out.println(retorno);

//        imprimirMOD(convertirMayusculas,"Esto se convertira a mayusculas");
//        imprimirMOD(convertirMinusculas,"ESTO SE CONVERTIRA EN MINUSCULAS");


    }
}
