package parcial_tudai_2022;

import java.util.ArrayList;

public class Sitio {
    private ArrayList <Condicion> condiciones;

    public void assignKeyWord(Noticia n){
        for (Condicion c : condiciones) {
            c.assign(n);
        }
    }

}
