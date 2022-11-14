package prefi_tudai_2020;

import java.util.ArrayList;

public class JefeHumilde extends Jefe{
    private int cantDevuelta;

    public JefeHumilde(String nombre, String apellido, int edad, int aniosAntig, int sueldoFijo) {
        super(nombre, apellido, edad, aniosAntig, sueldoFijo);
    }

    public ArrayList <String> getkeyWordsEsp(){
        ArrayList <String> aux = super.getkeyWordsEsp();
        ArrayList <String> res = new ArrayList<>();

        for (int i = 0; i <= cantDevuelta; i++) {
            res.add(aux.get(i));
        }
        return res;
    }
    
}
