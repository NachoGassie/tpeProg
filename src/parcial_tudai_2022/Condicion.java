package parcial_tudai_2022;

import java.util.ArrayList;

public class Condicion {
    private Filtro f;
    private ArrayList <String> keyWord;
    
    public Condicion(Filtro f) {
        this.f = f;
        keyWord = new ArrayList<>();
    }

    public void addKeyWord(String k){
        keyWord.add(k);
    }
    public void assign(Noticia n){

        if (f.cumple(n)){
            for (String k : keyWord) {
                n.addKeyWord(k);
            }
        } 
    }
    
}
