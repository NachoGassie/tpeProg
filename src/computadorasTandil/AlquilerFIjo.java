package computadorasTandil;

public class AlquilerFIjo extends CobroAlquiler{
    private int costoFijo;

    public AlquilerFIjo(int costoFijo){
        this.costoFijo = costoFijo;
    }

    @Override
    public int formaCobro(Producto p) {
        return costoFijo;
    }
    
}
