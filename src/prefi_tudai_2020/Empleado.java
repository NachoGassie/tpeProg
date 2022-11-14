package prefi_tudai_2020;

import java.util.ArrayList;

public class Empleado extends Personal{
    private int horasTrabajadas, horasExtra;
    private ArrayList <String> keyWordsEsp;


    public Empleado(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        keyWordsEsp = new ArrayList<>();

    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public int getHorasExtra() {
        return horasExtra;
    }
    public ArrayList <String> getkeyWordsEsp(){
        return new ArrayList<>(keyWordsEsp);
    }


    public int cobroSueldo(FormaCobrar f){
        return f.getSueldo(this);
    }
    
    public ArrayList <Personal> buscar(CompPersonal c){
        ArrayList <Personal> aux = new ArrayList<>();
        aux.add(this);
        return aux;
    }


    public int personalCargo(){
        return 1;
    }
    
}
