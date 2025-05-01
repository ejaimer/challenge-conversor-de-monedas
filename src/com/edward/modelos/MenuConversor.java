package com.edward.modelos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MenuConversor {
    private int opcion;
    private String menu = """
                ************************************************
                Bienvenido al conversor de moneda internacion =]
                
                1) Dolar =>>> Peso argentino
                2) Peso argentino =>>> Dolar
                3) Dolar =>>> Real Brasileño
                4) Real Brasileño =>>> Dolar
                5) Dolar =>>> Peso Colombiano
                6) Peso Colombiano =>>> Dolar
                7) Dolar =>>> Soles peruanos
                8) Soles peruanos =>>> Dolar
                9) Imprimir Registo de cambios de moneda realizados 
                10) Salir
                
                Elija una opcion válida : 
                
                *************************************************
                """;

    public void setOpcion() {
        List<Integer> opciones = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        Scanner teclado = new Scanner(System.in);
        System.out.println(menu);
        int opcionIngresada = teclado.nextInt();
        while (!opciones.contains(opcionIngresada)){
            System.out.println("ingreseuna opcion valida");
            opcionIngresada = teclado.nextInt();
        }
        this.opcion = opcionIngresada;
    }
    public int getOpcion(){
        return  opcion;
    }
}
