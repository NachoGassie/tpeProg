package parcial_tudai_2022;

import java.util.ArrayList;

public class Noticia extends Elemento{


    private String autor, categoria, contenido;
    private ArrayList <String> keyWords;

    public Noticia(String titulo, String autor, String categoria, String contenido) {
        super(titulo);
        this.autor = autor;
        this.categoria = categoria;
        this.contenido = contenido;
        keyWords = new ArrayList<>();
    }


    public String getAutor() {
        return autor;
    }
    public String getCategoria() {
        return categoria;
    }
    public String getContenido() {
        return contenido;
    }

    @Override
    public ArrayList<String> getKeyWords() {
        return new ArrayList<>(keyWords);
    }
    public ArrayList <Elemento> buscar(Filtro f){
        ArrayList <Elemento> aux = new ArrayList<>();
        if (f.cumple(this)) 
            aux.add(this);
        return aux;
    }
    
    public void addKeyWord(String k){
        if (!keyWords.contains(k)) {
            keyWords.add(k);
        }
    }
}
