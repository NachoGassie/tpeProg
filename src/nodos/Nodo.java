package nodos;

public class Nodo {
    private int valor;
    private Nodo siguiente;
    private int pos;
    
    public Nodo(int valor) {
        this.valor = valor;
    }


    public boolean equals (Object o1){
        try {
            Nodo n1 = ((Nodo)o1);
            return this.valor == n1.getValor();
        } catch (Exception e) {
            return false;
        }
        

    }

    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    public Nodo getSiguiente() {
        return siguiente;
    }

    public int getPos() {
        return pos;
    }
    public void setPos(int pos) {
        this.pos = pos;
    }
    


    @Override
    public String toString() {
        return "Nodo [valor=" + valor + ", siguiente=" + siguiente + "]";
    }




    
}
