package recu_tudai_2022;

import java.util.ArrayList;
import java.util.Collections;

public class Seccion extends Elem{
    protected ArrayList <Elem> elems;

    public Seccion(String categoria) {
        super(categoria);
        this.elems = new ArrayList<>();
    }    

    public ArrayList <String> getKw(){
        ArrayList <String> aux = new ArrayList<>();
        for (Elem e : elems) {
            for (String k: e.getKw()) {
                if (!aux.contains(k)) 
                    aux.add(k);
            }
        }
        return aux;
    }
    public void addElem(Elem e){
        elems.add(e);
        Collections.sort(elems);
    }
    private boolean notEmpty(){
        return !elems.isEmpty();
    }
    
    public Elem getCopia(Filtro f){
        Seccion copia = new Seccion(getCategoria());

        for (Elem e : elems) {
            if (e.getCopia(f) != null) 
              copia.addElem(e);
        }

        if (copia.notEmpty()) 
            return copia;
        return null;
    }
}
