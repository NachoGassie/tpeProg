package recu_tudai_2021;

public class ComoPagaUno extends Combo{
    

    public int getPrecio(){
        int mayor = 0;
        for (Componente c : componentes) {
            if (c.getPrecio()> mayor) {
                mayor = c.getPrecio();
            }
        }
        return mayor;
    }

    public Componente getCopia(Filtro f){
        if (f.cumple(this)) {
            ComoPagaUno copia = new ComoPagaUno();
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

}
