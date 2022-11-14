package recu_tudai_2022;

import java.util.ArrayList;

public class Portal {
    private ArrayList <Elem> elems;
    private ArrayList <Suscriptor> subs;

    public void sendNew(Noticia n){
        for (Suscriptor sub : subs) 
            sub.addNoticia(n);
    }
    public ArrayList <Elem> getList(Filtro f){
        ArrayList <Elem> aux = new ArrayList<>();

        for (Elem e : elems) {
            if (e.getCopia(f) != null) 
                aux.add(e);
        }
        return aux;
    }
}
