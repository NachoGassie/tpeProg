package prefi_tudai_2020;

import java.util.ArrayList;

public abstract class Personal {
    protected String nombre, apellido;
    protected int edad;

    public Personal(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public abstract int cobroSueldo(FormaCobrar f);
    public abstract int personalCargo();
    public abstract ArrayList <String> getkeyWordsEsp();
    public abstract ArrayList <Personal> buscar(CompPersonal c);
}
