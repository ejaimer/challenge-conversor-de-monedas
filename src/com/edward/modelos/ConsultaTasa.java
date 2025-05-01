package com.edward.modelos;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import javax.lang.model.type.NullType;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

public class ConsultaTasa {
    private String monedaOrigen;
    private String monedaDestino;
    private int opcion;
    private double cantidad;
    private double conversion;
    public Double buscarTasaCambio(int opcion){
        this.opcion = opcion;
        String url_str = "https://v6.exchangerate-api.com/v6/3c9a6b33dbf854b0d8c255cd/latest/USD";

        // Making Request
        try {
            // URL
            URL url = new URL(url_str);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            // Convert to JSON
            JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
            JsonObject jsonobj = root.getAsJsonObject();

            // Accessing object
            String req_result = jsonobj.get("result").getAsString();
            System.out.println("Se extrajo la tasa de cambio de manera :"+req_result);
            //accesando al objeto "conversion_rates"
            var rates = jsonobj.get("conversion_rates"); // es un objeto json conformado por k:v
            //System.out.println(rates);
            //
            Gson gson = new Gson();
            TasaDeCambio miTasa = gson.fromJson(rates,TasaDeCambio.class);
            //System.out.println(miTasa);
            //System.out.println(miTasa.AED());
            switch (opcion) {
                case 1 :
                    this.monedaOrigen ="[USD]";
                    this.monedaDestino ="[ARS]";
                    this.opcion = 1;
                    return miTasa.ARS();
                case 2 :
                    this.monedaOrigen="[ARS]";
                    this.monedaDestino= "[USD]";
                    this.opcion = 2;
                    return 1 / miTasa.ARS();
                case 3 :
                    this.monedaOrigen= "[USD]";
                    this.monedaDestino= "[BRL]";
                    this.opcion = 3;
                    return miTasa.BRL();
                case 4 :
                    this.monedaOrigen="[BRL]";
                    this.monedaDestino="[USD]";
                    this.opcion = 4;
                    return 1 / miTasa.BRL();
                case 5 :
                    this.monedaOrigen="[USD]";
                    this.monedaDestino="[COP]";
                    this.opcion = 5;
                    return miTasa.COP();
                case 6 :
                    this.monedaOrigen ="[COP]";
                    this.monedaDestino ="[USD]";
                    this.opcion= 6;
                    return 1 / miTasa.COP();
                case 7 :
                    this.monedaOrigen= "[USD]";
                    this.monedaDestino= "[PEN]";
                    this.opcion= 7;
                    return miTasa.PEN();
                case 8 :
                    this.monedaOrigen = "[PEN]" ;
                    this.monedaDestino = "[USD]";
                    this.opcion = 8;
                    return  1 / miTasa.PEN();
                default :
                    this.monedaOrigen = null;
                    this.monedaDestino = null;
                    this.opcion = Integer.parseInt(null);
                    return 0.0;
            }

        }catch (Exception e){
                throw  new RuntimeException("Ocurrio un problema a obtener la tasa de cambio :"+e.getMessage());
        }

    }

    public String getMonedaOrigen() {
        return monedaOrigen;
    }

    public String getMonedaDestino() {
        return monedaDestino;
    }

    public int getOpcion() {
        return opcion;
    }
    public double getCantidad() {
        return cantidad;
    }
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    public void setConversion(double conversion) {
        this.conversion = conversion;
    }

    public double getConversion() {
        return conversion;
    }

    public String toString(){
        return "("+getCantidad()+getMonedaOrigen()+"-->"+getConversion()+getMonedaDestino()+")";
    }
}
