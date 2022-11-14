package parcial_tudai_2022;

import java.util.ArrayList;
import java.util.Collections;

public class NewSeccion extends Seccion{

    public NewSeccion(String titulo, int valorArray) {
        super(titulo, valorArray);
    }
    
    public String getCategoria(){
        return titulo;
    }

    public ArrayList <String> getKeyWords(){
        ArrayList <String> aux = super.getKeyWords();

        Collections.sort(aux);
        
        ArrayList <String> resultado = new ArrayList<>();
        for (int i = 0; i<valorArray; i++) {
            resultado.add(aux.get(i));
        }
        return resultado;
    }
    
}
