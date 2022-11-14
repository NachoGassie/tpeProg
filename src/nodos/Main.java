package nodos;

public class Main {
    public static void main(String[] args) {
        CompValor c = new CompValor(); 

        Lista list = new Lista(c);

        Nodo n1 = new Nodo(23);
        Nodo n2 = new Nodo(4);
        Nodo n3 = new Nodo(74);
        Nodo n4 = new Nodo(32);

        list.addToEnd(n1);
        list.addToEnd(n2);
        list.addToEnd(n3);
        list.addToEnd(n4);

        list.mostrar();

        System.out.println("");

        // list.delete(n2);
        // list.mostrar();

        // System.out.println(list.getSize());
        // System.out.println(list.obtenerNodoPos(0));

        // System.out.println(list.obtenerPos(n2));
        // list.deletePos(3);
        // list.mostrar();
        list.ordenar();
        list.recorrer();
    }

}
