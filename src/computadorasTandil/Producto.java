package computadorasTandil;

import java.util.ArrayList;

public class Producto extends Elemento{
    private int valor, antiguedad;
    private String descripcion;


    public int getValor() {
        return valor;
    }
    public int getAntiguedad() {
        return antiguedad;
    }
    public String getDescripcion() {
        return descripcion;
    }
    
    @Override
    public ArrayList<Elemento> buscar(Filtro f) {
        ArrayList <Elemento> aux = new ArrayList<>();
        if (f.cumple(this)) {
            aux.add(this);
        }
        return aux;
    }

    public int getAlquiler(CobroAlquiler alq){
        return alq.formaCobro(this);
    }
}
