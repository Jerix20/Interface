package co.edu.umanizales.model;

import co.edu.umanizales.model.interfaces.MigradorAble;
import co.edu.umanizales.model.interfaces.NadadorAble;
import co.edu.umanizales.model.interfaces.SonidoAble;
import co.edu.umanizales.model.interfaces.VoladorAble;

public class Pato implements VoladorAble, NadadorAble, SonidoAble, MigradorAble {
    @Override
    public void volar() {
        System.out.println("El pato vuela a baja altura");
    }
    @Override
    public void nadar() {
        System.out.println("El pato nada en el lago");
    }
    @Override
    public void hacerSonido() {
        System.out.println("El pato hace 'cuac cuac'");
    }
    @Override
    public void migrar() {
        System.out.println("El pato migra al sur en invierno");
    }
}

