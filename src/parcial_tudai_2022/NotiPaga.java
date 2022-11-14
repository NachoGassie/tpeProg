package parcial_tudai_2022;

import java.util.ArrayList;

public class NotiPaga extends Noticia{
    private int precio;

    public NotiPaga(String titulo, String autor, String categoria, String contenido, int precio) {
        super(titulo, autor, categoria, contenido);
        this.precio = precio;
    }

    public int getPrecio(){
        return precio;
    }


    public ArrayList <Elemento> buscar(Filtro f){
        ArrayList <Elemento> aux = new ArrayList<>();
        aux.add(this);
        return aux;
    }
    
}
