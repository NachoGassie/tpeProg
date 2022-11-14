package prefi_tudai_2020;

public abstract class FormaCobrar {
    protected int sueldoExtra;

    public int getSueldoExtra(Empleado e) {
        return sueldoExtra * e.getHorasExtra();
    }

    
    public abstract int getSueldo(Empleado e);



}
