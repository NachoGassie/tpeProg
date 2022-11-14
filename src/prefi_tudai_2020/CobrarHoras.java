package prefi_tudai_2020;

public class CobrarHoras extends FormaCobrar{
    private int sueldoHora;

    public CobrarHoras(int sueldoHora) {
        this.sueldoHora = sueldoHora;
    }

    @Override
    public int getSueldo(Empleado e) {
        int sueldoNeto = sueldoHora * e.getHorasTrabajadas();
        if (e.getHorasExtra()>0) {
            return sueldoNeto + getSueldo(e);
        }
        return sueldoNeto;
    }
}
