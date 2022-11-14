package nodos;

public class Lista {
    private Nodo cabeza;
    private int size;
    private CompValor c;


    public Lista(CompValor c) {
        this.c = c;
    }

    public void addToEnd(Nodo n){
        if (isVacia())
            setCabeza(n);
        
        else{
            Nodo ult = cabeza;
            int cont = 1;
            while (ult.getSiguiente() != null) {
                ult = ult.getSiguiente();
                cont += 1;
            }
            
            n.setPos(cont);
            ult.setSiguiente(n);
        } 
        size++;
    }

    public void ordenar(){
        Nodo j = cabeza;
        Nodo i = cabeza;
        Nodo temp;
        int posTemp;
        while (j.getSiguiente() != null){


            if (c.compare(i, i.getSiguiente()) > 0) {

                // posTemp = i.getPos();
                // i.setPos(i.getSiguiente().getPos());
                // i.getSiguiente().setPos(posTemp);
                temp = i;
                i = i.getSiguiente();
                i.setSiguiente(temp); 
            }

            j = j.getSiguiente();
            // int temp;
            // for (int i = 1; i < array.length; i++) {
            //     for (int j = 0; j < array.length; j++) {
            //         if (j>j+1) {
            //             temp = j;
            //             j += 1;
            //             [j+1] = temp;
            //         }
            //     }
            // }
        }
        System.out.println(i.getValor());
    }

    public String delete(Nodo n){
        if (!isVacia()) {
            
            if (cabeza == n) 
                cabeza = cabeza.getSiguiente();
            else{
                Nodo i = cabeza;
                while(i.getSiguiente() != null){
                    if (i.getSiguiente() == n) {

                        i.setSiguiente(i.getSiguiente().getSiguiente());
                        bajarPos(i);
                        
                    }
                    i = i.getSiguiente();
                }
            }
            size--;
            return "ocurrencias eliminadas";
        }
        return "La lista está vacía";
    }

    public String deletePos(int pos){
        if (!isVacia()) {
            
            Nodo nodo = cabeza;
            while(nodo.getSiguiente() != null && nodo.getSiguiente().getPos()<pos){
                nodo = nodo.getSiguiente();
            }

            if (nodo.getSiguiente().getPos() == pos) {

                nodo.setSiguiente(nodo.getSiguiente().getSiguiente());
                bajarPos(nodo);
            }
            
            size--;
            return "ocurrencias eliminadas";
        }
        return "La lista está vacía";
    }
    public void mostrar(){
        Nodo i = cabeza;
        while (i != null) {
            System.out.println(i.getPos());
            i = i.getSiguiente();
        }
    }
    // public Nodo obtenerNodoPos(int posReq){
    //     int i = 0;
    //     Nodo temp = cabeza;
    //     while(i<posReq && i<=size){
    //         temp = temp.getSiguiente();
    //         i++;
    //     }

    //     if (i<=posReq) 
    //         return temp;
        
    //     return null;
    // }


    public int obtenerPos(Nodo n){
        if (!isVacia()) {
            
            Nodo nodo = cabeza;
            while(nodo.getSiguiente() != null && ! nodo.equals(n)){
                nodo = nodo.getSiguiente();
            }

            if (nodo.equals(n)) 
                return nodo.getPos();
            
    
        }
        return -1;
    }

    public void recorrer(){
        Nodo i = cabeza;
        while (i != null){
            System.out.println(i.getValor());
            i = i.getSiguiente();
        }
    }

    public boolean isVacia(){
        return cabeza == null;
    }
    public int getSize(){
        return size;
    }
    private void setCabeza(Nodo n){
        n.setPos(0);
        cabeza = n;
    }
    private void bajarPos(Nodo inicio){
        Nodo i = inicio;
        while(i.getSiguiente() != null){
            i.getSiguiente().setPos(i.getPos()-1);
            i = i.getSiguiente();
        }
    }



    public CompValor getC() {
        return c;
    }

    public void setC(CompValor c) {
        this.c = c;
    }

}
