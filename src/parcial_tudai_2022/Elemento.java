package parcial_tudai_2022;

import java.util.ArrayList;

public abstract class Elemento {
    protected String titulo;

    public Elemento(String titulo) {
        this.titulo = titulo;
    }


    public String getTitulo() {
        return titulo;
    }


    public abstract String getCategoria();
    public abstract ArrayList <String> getKeyWords();
    public abstract ArrayList <Elemento> buscar(Filtro f);
}
