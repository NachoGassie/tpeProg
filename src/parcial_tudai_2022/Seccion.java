package parcial_tudai_2022;

import java.util.ArrayList;

public class Seccion extends Elemento{
    protected ArrayList <Elemento> elementos;
    protected int valorArray;
    private static String catePreEstablecida; 

    public Seccion(String titulo, int valorArray) {
        super(titulo);
        this.valorArray = valorArray;
        Seccion.catePreEstablecida = "Sin Definir";
    }

    //Valor Array = pos predefinida;
    @Override
    public String getCategoria() {
        if (valorArray<=elementos.size()) {
            return elementos.get(valorArray).getCategoria();
        }
        return catePreEstablecida /* "Sin Definir" */;
    }

    public ArrayList <String> getKeyWords(){
        ArrayList <String> aux = new ArrayList<>();

        for (Elemento e : elementos) {
            for (String cate : e.getKeyWords()) {
                if (!aux.contains(cate)) {
                    aux.add(cate);
                }
            }
        }

        return aux;
    }

    public ArrayList <Elemento> buscar(Filtro f){
        ArrayList <Elemento> aux = new ArrayList<>();
        
        for (Elemento e : elementos) 
            aux.addAll(e.buscar(f));
        
        return aux;
    }
    
}
