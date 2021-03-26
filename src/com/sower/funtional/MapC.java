package com.sower.funtional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapC {

    private Map<Integer,String> map;


    public void poblar(){
        map = new HashMap<>();
        map.put(1,"Cancuna");
        map.put(2,"Holbox");
        map.put(3,"Bacalar");
        map.put(4,"Tulum");
        map.put(7,"Balandra");
    }


    public void imprimir_v7(){
        for (Map.Entry<Integer, String> e :
                map.entrySet()) {
            System.out.println("Llave: "+e.getKey() + " Valor: "+e.getValue());
        }
    }

    public void imprimir_v8(){
        map.forEach((k,v)->System.out.println("Llave: "+k + " Valor: "+v));
        System.out.println("AAAAAAAAAAAAAAA");
        map.entrySet().forEach(System.out::println);
    }

    public void insertarSiAusente(){
        map.putIfAbsent(5,"Playacar");
    }

    public void operarSiPresente(){
        map.computeIfPresent(3,(k,v)->k+v);
        System.out.println(map.get(3));
    }

    public void obtenerOrPredeterminado(){
        String valor  = map.getOrDefault(11,"valor por defecto");
        System.out.println(valor);
    }

    public void recolectar(){
        Map<Integer,String> mapaRecolectado = map.entrySet().stream()
                .filter(e->e.getValue().contains("Ba"))
                .collect(Collectors.toMap(p -> p.getKey(),p -> p.getValue()));
        mapaRecolectado.entrySet().forEach(System.out::println);
    }

    public static void main(String[] args) {
        MapC mpac = new MapC();
        mpac.poblar();
        mpac.imprimir_v8();
        System.out.println("????????????????????????/");
        mpac.insertarSiAusente();
        mpac.insertarSiAusente();
        mpac.imprimir_v8();
        System.out.println("//////////////////////");
        mpac.operarSiPresente();
        System.out.println("........................");
        mpac.obtenerOrPredeterminado();
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        mpac.recolectar();

    }
}
