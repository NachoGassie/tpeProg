package computadorasTandil;

import java.util.ArrayList;

public abstract class Elemento {
    private int idCode;

    public int getIdCode() {
        return idCode;
    }

    public abstract int getValor();
    public abstract int getAntiguedad();
    public abstract int getAlquiler(CobroAlquiler alq);
    public abstract ArrayList <Elemento> buscar(Filtro f);
}
