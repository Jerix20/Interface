package co.edu.umanizales.model;

import co.edu.umanizales.model.interfaces.MigradorAble;
import co.edu.umanizales.model.interfaces.SonidoAble;
import co.edu.umanizales.model.interfaces.VoladorAble;

public class Gaviota implements VoladorAble, SonidoAble, MigradorAble {
    @Override
    public void volar() {
        System.out.println("La gaviota vuela sobre el mar");
    }
    @Override
    public void hacerSonido() {
        System.out.println("La gaviota hace un sonido fuerte");
    }
    @Override
    public void migrar() {
        System.out.println("La gaviota migra a climas más cálidos");
    }
}
