package recu_tudai_2022;

import java.util.ArrayList;

public class Suscriptor {
    private Filtro f;
    private String nombre, apellido, email;
    private ArrayList <Noticia> news;

    public Suscriptor(Filtro f, String nombre, String apellido, String email) {
        this.f = f;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.news = new ArrayList<>();
    }
    
    public void addNoticia(Noticia n){
        if (f.cumple(n)) 
            news.add(n);
    }

    public Filtro getF() {
        return f;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getEmail() {
        return email;
    }
}
