package co.edu.umanizales.model;

import co.edu.umanizales.model.interfaces.SonidoAble;
import co.edu.umanizales.model.interfaces.VoladorAble;

public class Murcielago implements VoladorAble, SonidoAble {
    @Override
    public void volar() {
        System.out.println("El murciélago le gusta volar de noche");
    }
    @Override
    public void hacerSonido() {
        System.out.println("El murciélago emite sonidos de ultrasonido");
    }
}