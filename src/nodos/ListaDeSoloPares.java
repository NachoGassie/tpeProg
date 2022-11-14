package nodos;

import java.util.ArrayList;

public class ListaDeSoloPares implements Recorrible{
    private ArrayList<Integer> elementos;
    private int cursor;

    public ListaDeSoloPares() {
        elementos = new ArrayList<>();
        cursor = 0;
    }

    public void agregarElemento(int i) {
        if (i%2==0)
        elementos.add(i);
    }

    public Integer obtenerElemento(int pos) {
        return elementos.get(pos);
    }



    //Iterator
    public void irAlPrimero() {
        cursor = 0;
    }
    public boolean quedanMas() {
        return cursor < elementos.size();
    }
    public Integer obtenerSiguiente() {
        cursor++;
        return elementos.get(cursor-1);
    }
}
