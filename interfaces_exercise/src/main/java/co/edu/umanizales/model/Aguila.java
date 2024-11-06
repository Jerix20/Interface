package co.edu.umanizales.model;

import co.edu.umanizales.model.interfaces.SonidoAble;
import co.edu.umanizales.model.interfaces.VoladorAble;

public class Aguila implements VoladorAble, SonidoAble {
    @Override
    public void volar() {
        System.out.println("El águila vuela a gran altura");
    }
    @Override
    public void hacerSonido() {
        System.out.println("El águila emite un grito agudo");
    }
}
