package recu_tudai_2022;

import java.util.ArrayList;

public abstract class Elem implements Comparable<Elem>{
    private String categoria;

    public Elem(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }
    public abstract ArrayList <String> getKw();
    public abstract Elem getCopia(Filtro f);

    public int compareTo(Elem otro) {
        return this.getCategoria().compareTo(otro.getCategoria());
    }
}
