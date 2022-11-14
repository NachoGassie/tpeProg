package prefi_tudai_2020;

import java.util.Comparator;

public abstract class CompPersonal implements Comparator <Personal>{
    protected CompPersonal next;


    // Forma no dinámica
    // public int compare(Personal p1, Personal p2) {
    //     int comparApe = p1.getApellido().compareTo(p2.getApellido());

    //     if (comparApe == 0) {
    //         return p1.getNombre().compareTo(p2.getNombre());
    //     }
    //     return comparApe;
    // }


    public abstract int comparar(Personal p1, Personal p2);

    @Override
    public int compare(Personal p1, Personal p2) {
        int comp = this.comparar(p1, p2);

        if (comp == 0 && next != null) 
            return next.compare(p1, p2);
        
        return comp;    
    }

}
