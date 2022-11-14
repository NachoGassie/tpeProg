package computadorasTandil;

import java.util.ArrayList;

public class ProdObsoleto extends Elemento{
    private int maxMeses;
    private int descPorMes;
    private int descAlquiler;
    private Elemento referencia;

    @Override
    public int getValor() {
        if (checkAntig()) {
            return referencia.getValor();
        }

        int descuento =  descPorMes * (referencia.getAntiguedad() - maxMeses);
        return referencia.getValor() - (descuento/100);
    }

    @Override
    public int getAntiguedad() {
        return referencia.getAntiguedad();
    }

    private boolean checkAntig(){
       return maxMeses<referencia.getAntiguedad();
    }
    
    @Override
    public ArrayList<Elemento> buscar(Filtro f) {
        ArrayList <Elemento> aux = new ArrayList<>();
        if (checkAntig()) 
            aux.addAll(referencia.buscar(f));
        return aux;
    }

    public int getAlquiler(CobroAlquiler alq){
        if (checkAntig()) {
            return referencia.getAlquiler(alq) / descAlquiler;
        }
        return referencia.getAlquiler(alq);
    }
}
