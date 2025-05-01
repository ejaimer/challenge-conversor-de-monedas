package com.edward.principal;

import com.edward.modelos.ConsultaTasa;
import com.edward.modelos.MenuConversor;
import com.edward.modelos.RegistroCambiosMoneda;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        RegistroCambiosMoneda miRegistro = new RegistroCambiosMoneda();
        while (true) {
            // Creamos una instancia del menu
            MenuConversor miMenu = new MenuConversor();
            miMenu.setOpcion();
            // se asina una opcion en el menu
            int opcion = miMenu.getOpcion();

            if (opcion == 10) {
                System.out.println("Gracias por usar nuestro sistema");
                break;
            }else if(opcion >= 1 && opcion <= 8){
                System.out.println("Elegiste la opcion " + opcion);
                //Creamos una instancia de la consulta de tasa
                ConsultaTasa miConsulta = new ConsultaTasa();
                //Extraemos la tasa de cambio de acuerdo a la opcion
                double TasaOpcion = miConsulta.buscarTasaCambio(opcion);
                //System.out.println("La tasa de cambio es : "+TasaOpcion);

                // Solicitamos una  cantidad para convertir
                Scanner teclado = new Scanner(System.in);
                System.out.println("Ingrese el valor que deseas covertir :");
                double valor = teclado.nextDouble();
                miConsulta.setCantidad(valor);

                // Se realiza el cambio
                double cambio = valor * TasaOpcion;
                cambio = Math.round(cambio * 100) / 100.0;
                miConsulta.setConversion(cambio);

                //Se imprime el resultado

                System.out.println("El valor " + valor + " " + miConsulta.getMonedaOrigen() + " corresponde al valor final de ->>> " + cambio + " " + miConsulta.getMonedaDestino());
                miRegistro.addConsulta(miConsulta);

            }else if(opcion == 9){
                System.out.println("Registros de cambios de moneda realizados :");
                System.out.println(miRegistro.getListaDeConsultas());
            }
        }
    }
}
