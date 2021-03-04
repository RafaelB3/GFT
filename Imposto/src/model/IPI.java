package model;

public class IPI implements Imposto {
    /*
     * Incide 7% sobre o valor, desde que seja abaixo de 20000 
     * Incide 19% sobre o valor, se for igual ou maior que 20000
     */
    double aliquotaIPI1 = (7.0/100);
    double aliquotaIPI2 = (19.0/100);
    @Override
    public double calculaImposto(double valor) {
        if (valor < 20000) {
            return valor * aliquotaIPI1;
        } else {
            return valor * aliquotaIPI2;
        }
    }

}
