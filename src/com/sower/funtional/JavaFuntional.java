package com.sower.funtional;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class JavaFuntional {


    public static void main(String[] args) {

//        System.out.println(buscar("David123").getNombre());

        Optional<Persona> persona =  buscarOptional("david");


        if (persona.isPresent()) {
            System.out.println(persona.get());
        }else{
            System.out.println("Persona no encontrada");
        }

    }

    static Persona buscar(String nombre){
        for (Persona persona:
             lista) {
            if(persona.getNombre().equals(nombre)){
                return persona;
            }
        }
        return null;
    }

    static Optional<Persona> buscarOptional(String nombre){
        for (Persona persona :
                lista) {
            if(persona.getNombre().equals(nombre)){
                return Optional.of(persona);
            }
        }
        return  Optional.empty();
    }

    static List<Persona> lista = new ArrayList<Persona>();

    static {
        lista.add(new Persona("David"));
        lista.add(new Persona("Alejandro"));
        lista.add(new Persona("jazmin"));
    }
}
