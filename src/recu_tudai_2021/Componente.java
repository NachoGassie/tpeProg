package recu_tudai_2021;

import java.util.ArrayList;

public abstract class Componente {
    protected String nombre;

    public abstract int getPeso();
    public abstract int getPrecio();
    public abstract int totalProd();
    public abstract Prod prodMenorPeso();
    public abstract Componente getCopia(Filtro f);
    public abstract ArrayList<String> getCategorias();


    public boolean tieneCategoria(String c){
        return getCategorias().contains(c);
    }

    
    public String getNombre() {
        return nombre;
    }
}
