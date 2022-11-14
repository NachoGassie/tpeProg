package recu_tudai_2022;

import java.util.ArrayList;
import java.util.Collections;

public class NewSeccion extends Seccion{
    private ArrayList <String> categRequeridas;

    public NewSeccion(String categoria) {
        super(categoria);
        categRequeridas = new ArrayList<>();
    }
    
    public void addCategReq(String c){
        if (!categRequeridas.contains(c)) 
            categRequeridas.add(c);
    }

    public void addElem(Elem e){
        if (categRequeridas.contains(e.getCategoria())) 
            elems.add(e);
            Collections.sort(elems);
    }

    
    
}
