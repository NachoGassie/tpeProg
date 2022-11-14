package prefi_tudai_2020;

public class CobrarFijo extends FormaCobrar{
    private int sueldoFijo;
    
    public CobrarFijo(int sueldoFijo) {
        this.sueldoFijo = sueldoFijo;
    }

    @Override
    public int getSueldo(Empleado e) {
        if (e.getHorasExtra()>0) {
            return sueldoFijo + getSueldoExtra(e);
        }
        return sueldoFijo;
    }
    
}
