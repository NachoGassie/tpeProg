package prefi_tudai_2020;

import java.util.ArrayList;
import java.util.Collections;

public class Jefe extends Personal{
    private int aniosAntig, sueldoFijo;
    private ArrayList <Personal> empleados;


    public Jefe(String nombre, String apellido, int edad, int aniosAntig, int sueldoFijo) {
        super(nombre, apellido, edad);
        this.aniosAntig = aniosAntig;
        this.sueldoFijo = sueldoFijo;
    }


    public int getAniosAntig() {
        return aniosAntig;
    }
    public int getSueldoFijo() {
        return sueldoFijo;
    }
    public void addEmpleado(Personal p){
        empleados.add(p);
    }


    public ArrayList <String> getkeyWordsEsp(){
        ArrayList <String> aux = new ArrayList<>();
        for (Personal e : empleados) {
            for (String k: e.getkeyWordsEsp()) {
                if (!aux.contains(k)) {
                    aux.add(k);
                }
            }
        }
        return aux;
    }

    public int cobroSueldo(FormaCobrar f){
        int suma = 0;
        for (Personal p : empleados) {
            suma += p.cobroSueldo(f);
        }
        return suma + sueldoFijo;
    }

    public ArrayList <Personal> buscar(CompPersonal c){
        ArrayList <Personal> aux = new ArrayList<>();
        aux.add(this);
        for (Personal p : empleados) {
            ArrayList <Personal> tmp = p.buscar(c);
            aux.addAll(tmp);
        }
        Collections.sort(aux, c);
        return aux;
    }

    public int personalCargo(){
        int suma = 0;
        for (Personal p: empleados) {
            suma += p.personalCargo();
        }
        return suma;
    }
}
