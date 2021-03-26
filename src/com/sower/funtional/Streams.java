package com.sower.funtional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Streams {

    private List<String> lista;
    private List<String> numero;

    public Streams(){
        lista = new ArrayList<>();
        lista.add("sower");
        lista.add("wo");
        lista.add("ki");
        lista.add("sowerwoki");

        numero = new ArrayList<>();
        numero.add("1");
        numero.add("2");
        numero.add("3");
        numero.add("4");
    }

    public void filtrar(){
        lista.stream().filter(s -> s.startsWith("w")).forEach(System.out::println);

    }

    public void ordenar(){
        lista.stream().sorted().forEach(System.out::println);
        System.out.println("//////////");
        lista.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

    public void transformar(){
        lista.stream().map(String::toUpperCase).forEach(System.out::println);
        System.out.println("/////");
        numero.stream().map(x -> Integer.valueOf(x) + 1).forEach(System.out::println);
    }

    public void limitar(){
        lista.stream().limit(2).forEach(System.out::println);
    }

    public void contar(){
        System.out.println(lista.stream().count());
    }
    public static void main(String[] args) {
        Streams app = new Streams();
        app.filtrar();
        System.out.println("/////////////");
        app.ordenar();
        System.out.println("/////////////");
        app.transformar();
        System.out.println("/////////////");
        app.limitar();
        System.out.println("/////////////");
        app.contar();
    }
}
