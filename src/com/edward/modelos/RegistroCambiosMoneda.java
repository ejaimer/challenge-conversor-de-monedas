package com.edward.modelos;

import java.util.ArrayList;
import java.util.List;

public class RegistroCambiosMoneda {
    List<ConsultaTasa> listaDeConsultas = new ArrayList<>();

    public void addConsulta(ConsultaTasa consultaTasa) {
        listaDeConsultas.add(consultaTasa);
    }
    public List<ConsultaTasa> getListaDeConsultas() {
        return listaDeConsultas;
    }
}
