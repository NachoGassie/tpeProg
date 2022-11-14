package computadorasTandil;

public class AlquilerPlus extends CobroAlquiler{
    private CobroAlquiler alq1, alq2;

    public AlquilerPlus(CobroAlquiler alq1, CobroAlquiler alq2){
        this.alq1 = alq1;
        this.alq2 = alq2;
    }

    @Override
    public int formaCobro(Producto p) {
        return alq1.formaCobro(p) + alq2.formaCobro(p);
    }
}
