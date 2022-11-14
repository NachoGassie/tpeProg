package computadorasTandil;

public class AlquilerPorc extends CobroAlquiler{
    private int porcDesc;

    public AlquilerPorc(int porcDesc){
        this.porcDesc = porcDesc;
    }

    @Override
    public int formaCobro(Producto p) {
        return p.getValor() * (porcDesc/100);
    }
}
