package co.edu.umanizales;
import co.edu.umanizales.model.*;
import co.edu.umanizales.model.interfaces.*;

public class Main {
    public static void main(String[] args) {
        Pato alejo = new Pato();
        Aguila joe = new Aguila();
        Delfin isa = new Delfin();
        Tiburon jero = new Tiburon();
        Gaviota sebastian = new Gaviota();
        Murcielago male = new Murcielago();

        alejo.volar();
        alejo.nadar();
        alejo.hacerSonido();
        alejo.migrar();

        joe.volar();
        joe.hacerSonido();

        isa.nadar();
        isa.hacerSonido();

        jero.nadar();

        sebastian.volar();
        sebastian.hacerSonido();
        sebastian.migrar();

        male.volar();
        male.hacerSonido();
    }
}
