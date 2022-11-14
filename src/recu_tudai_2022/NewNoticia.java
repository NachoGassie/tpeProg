package recu_tudai_2022;

public class NewNoticia extends Noticia{

    public NewNoticia(String categoria, String titulo, String autor, String contenido) {
        super(categoria, titulo, autor, contenido);
    }

    public Elem getCopia(Filtro f){
        return null;
    }
    
}
