package com.sower.funtional;

import java.util.ArrayList;
import java.util.List;

public class ParallelStram {

    public List<Integer> numeros;

    public void llenar(){
        numeros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numeros.add(i);
        }
    }
    public void probarStrem(){
        numeros.stream().forEach(System.out::println);
    }

    public void probarParalelo(){
        numeros.parallelStream().forEach(System.out::println);
    }


    public static void main(String[] args) {
        ParallelStram app = new ParallelStram();
        app.llenar();
        app.probarStrem();
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa");
        app.probarParalelo();
    }
}
