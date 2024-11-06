package co.edu.umanizales.model;

import co.edu.umanizales.model.interfaces.NadadorAble;
import co.edu.umanizales.model.interfaces.SonidoAble;

public class Delfin implements NadadorAble, SonidoAble {
    @Override
    public void nadar() {
        System.out.println("El delfín nada flash en el océano");
    }
    @Override
    public void hacerSonido() {
        System.out.println("El delfín emite sonidos de chasquido");
    }
}