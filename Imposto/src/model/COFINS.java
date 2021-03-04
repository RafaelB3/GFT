package model;

public class COFINS implements Imposto {
    /*
     * Incide 4% sobre o valor, somente se for maior que 12000
     * Igual ou abaixo a 12000, não tem incidência
     */
    double aliquotaCOFINS = (4.0/100);
    @Override
    public double calculaImposto(double valor) {
        if (valor <= 12000) {
            return 0;
        } else {
            return valor * aliquotaCOFINS;
        }
    }
}
