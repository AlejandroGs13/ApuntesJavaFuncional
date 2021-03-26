package com.sower.funtional;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class JavaDate {

    public static void verificar(int version){
        if(version == 7){
            Calendar fecha1 = Calendar.getInstance();
            Calendar fecha2 = Calendar.getInstance();
            fecha1.set(1991,0,21);
            System.out.println(fecha1.after(fecha2));
        }else if(version == 8){
            //representa el mes 01 enero
            LocalDate fecha1 = LocalDate.of(1991,01,21);
            LocalDate fecha2 = LocalDate.now();

            System.out.println(fecha1.isAfter(fecha2));
            System.out.println(fecha1.isBefore(fecha2));


            LocalTime tiempo1 = LocalTime.of(22,30,50);
            LocalTime tiempo2 = LocalTime.now();
            System.out.println(tiempo1.isAfter(tiempo2));
            System.out.println(tiempo1.isBefore(tiempo2));

            LocalDateTime fehcatiempo1 = LocalDateTime.of(1994,7,13,8,13,50);
            LocalDateTime fehcatiempo2 = LocalDateTime.now();

            System.out.println(fehcatiempo1.isAfter(fehcatiempo2));
            System.out.println(fehcatiempo2.isAfter(fehcatiempo1));
        }
    }

    public static void medirTiempo(int version) throws InterruptedException{
        if(version == 7){
            long ini = System.currentTimeMillis();
            Thread.sleep(1000);
            long fin = System.currentTimeMillis();
            System.out.println(fin -ini);
        }else{
            Instant ini  = Instant.now();
            Thread.sleep(1000);
            Instant fin = Instant.now();
            System.out.println(Duration.between(ini,fin));//Se puede convertien a todas las medidas del tiempo con .to
        }
    }

    public static void entreDosFechas(){
        LocalDate nacimiento = LocalDate.of(1994,07,13);
        LocalDate actual = LocalDate.now();
        System.out.println("-------------------------------");
        System.out.println(Period.between(nacimiento,actual).getYears());//Devuelve el tipo de dato Piriod
        //Puedes obtener los datos en dias meses o years usando get si no usas ningun get trae todo el tiempo P26Y8M12D
    }

    public static void convertir(){
        String fecha = "21/01/1991";
//        LocalDate  fechaAc = LocalDate.parse(fecha); no acepta la fecha por defecto
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate  fechaAc = LocalDate.parse(fecha,formatter);
        System.out.println("oooooooooooooooo");
        System.out.println(fechaAc);
        System.out.println(formatter.format(fechaAc));
    }

    public static void main(String[] args) throws InterruptedException {
        verificar(8);
        System.out.println("aaaaaaaaaaaaaaaaaaaa");
//        medirTiempo(8);
        entreDosFechas();
        convertir();
    }
}
