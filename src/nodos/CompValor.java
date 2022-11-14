package nodos;

import java.util.Comparator;

public class CompValor implements Comparator<Nodo>{

    @Override
    public int compare(Nodo o1, Nodo o2) {
        return o1.getValor() - o2.getValor();
    }
    
}
