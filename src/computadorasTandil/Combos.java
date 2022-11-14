package computadorasTandil;

import java.util.ArrayList;

public class Combos extends Elemento{
    private ArrayList <Elemento> productos;

    @Override
    public int getValor() {
        int suma = 0;
        for (Elemento e : productos) {
            suma += e.getValor();
        }
        return suma;
    }

    @Override
    public int getAntiguedad() {
        int mayor = 0;
        for (Elemento e: productos) {
            if (e.getAntiguedad()>mayor) {
                mayor = e.getAntiguedad();
            }
        }
        return mayor;
    }

    @Override
    public ArrayList<Elemento> buscar(Filtro f) {
        ArrayList <Elemento> aux = new ArrayList<>();

        for (Elemento e : productos) {
            aux.addAll(e.buscar(f));
        }
        return aux;
    }

    public int getAlquiler(CobroAlquiler alq){
        int suma = 0;
        for (Elemento e: productos) {
            suma += e.getAlquiler(alq);
        }
        return suma;
    }
}
