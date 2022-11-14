package recu_tudai_2021;

import java.util.ArrayList;

public class Combo extends Componente{
    private double descuentoTope;
    private double descuentoInicial;
    protected ArrayList<Componente> componentes;

    //Producto con menorPeso;
    @Override
    public Prod prodMenorPeso() {
        int pesoMenor = 10000;
        Prod prodMenor = null;
        for (Componente c: componentes) {
            Prod prodAux = c.prodMenorPeso();
            if (prodAux != null && prodAux.getPeso()<pesoMenor) {
                prodMenor = prodAux;
                pesoMenor = prodAux.getPeso();
            }
        }

        return prodMenor;
    }

    //Total Productos
    public int totalProd(){
        int suma = 0;
        for (Componente c : componentes) {
            suma += c.totalProd();
        }
        return suma;
    }

    //Copia
    public Componente getCopia(Filtro f){
        if (f.cumple(this)) {
            Combo copia = new Combo();
            for (Componente c : componentes) {
                Componente temp = c.getCopia(f);
                if (temp != null) {
                    copia.componentes.add(temp);
                }
            }
            return copia;
        }
        return null;
    }


    //Getters y add
    @Override
    public int getPeso() {
        int suma = 0;
        for (Componente c : componentes) {
            suma += c.getPeso();
        }
        return suma;
    }
    @Override
    public int getPrecio() {
        int suma = 0;
        for (Componente c: componentes) {
            suma += c.getPrecio();
        }

        descuentoInicial = descuentoInicial * totalProd();
        if (descuentoInicial > descuentoTope) {
            descuentoInicial = descuentoTope;
        }

        return (int) (suma - (descuentoInicial/100));
    }
    @Override
    public ArrayList<String> getCategorias() {
        ArrayList <String> aux = new ArrayList<>();
        for (Componente c : componentes) {
            for (String cat : c.getCategorias()) {

                if (!aux.contains(cat)) 
                    aux.add(cat);
                
            }
        }
        return aux;
    }
    public void addComponente(Componente c, Filtro f){
        if (f.cumple(c)) 
            componentes.add(c);
    }
    
}
