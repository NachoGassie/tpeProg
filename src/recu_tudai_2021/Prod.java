package recu_tudai_2021;

import java.util.ArrayList;

public class Prod extends Componente{
    private int precio, peso;
    private ArrayList <String> categorias;

    public int getPeso(){
        return peso;
    }

    public int getPrecio(){
        return precio;
    }

    public void addCategorias(String c){
        categorias.add(c);
    }

    public ArrayList <String> getCategorias(){
        return new ArrayList<>(categorias);
    }

    @Override
    public Prod prodMenorPeso() {
        return this;
    }
    public int totalProd(){
        return 1;
    }
    public Componente getCopia(Filtro f){
        if (f.cumple(this)) {
            Prod copia = new Prod();
            copia.categorias.addAll(this.getCategorias());
            return copia;
        }
        return null;
    }
}
