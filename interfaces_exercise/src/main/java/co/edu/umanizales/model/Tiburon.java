package co.edu.umanizales.model;

import co.edu.umanizales.model.interfaces.NadadorAble;

public class Tiburon implements NadadorAble {
    @Override
    public void nadar() {
        System.out.println("El tiburón nada de forma sigilosa");
    }
}
