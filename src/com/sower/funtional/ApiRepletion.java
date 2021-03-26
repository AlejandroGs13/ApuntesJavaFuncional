package com.sower.funtional;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class ApiRepletion {

    @Retention(RetentionPolicy.RUNTIME)
    public @interface  Lenguajes{
        Lenguaje[] value() default {};
    }

    @Repeatable(value = Lenguajes.class)
    public @interface Lenguaje{
        String value();
    }

    //1.7
//    @Lenguajes({
//            @Lenguaje("Java"),
//            @Lenguaje("Python")
//    })
    //1.8
    @Lenguaje("Java")
    @Lenguaje("Python")
    public interface LenguajeProgramacion{

    }


    public static void main(String[] args) {
        Lenguaje[] lenguajeArray = LenguajeProgramacion.class.getAnnotationsByType(Lenguaje.class);
        System.out.println("Se tiene "+lenguajeArray.length + " anotaciones en lenguaje");
        Lenguajes lenguajes = LenguajeProgramacion.class.getAnnotation(Lenguajes.class);
        for (Lenguaje len :
                lenguajes.value()) {
            System.out.println(len.value());
        }
    }
}
