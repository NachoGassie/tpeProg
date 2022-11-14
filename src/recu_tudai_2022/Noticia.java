package recu_tudai_2022;

import java.util.ArrayList;

public class Noticia extends Elem{
    private String titulo, autor, contenido;
    private ArrayList <String> keyWords;

    public Noticia(String categoria, String titulo, String autor, String contenido) {
        super(categoria);
        this.titulo = titulo;
        this.autor = autor;
        this.contenido = contenido;
        this.keyWords = new ArrayList<>();
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public String getContenido() {
        return contenido;
    } 
    public ArrayList <String> getKw(){
        return new ArrayList<>(keyWords);
    }

    public Elem getCopia(Filtro f){
        if (f.cumple(this)) 
            return new Noticia(autor, titulo, autor, contenido);
        return null;
    }
}
