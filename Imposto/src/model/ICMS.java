package model;

public class ICMS implements Imposto {
    /* Incide 27% sobre o valor */
    
    double aliquotaICMS = (27.0 / 100);

    @Override
    public double calculaImposto(double valor) {

        return (valor * aliquotaICMS);
    }
}
