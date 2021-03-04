import java.text.DecimalFormat;
import java.util.Scanner;

import model.COFINS;
import model.ICMS;
import model.IPI;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        ICMS icms = new ICMS();
        IPI ipi = new IPI();
        COFINS cofins = new COFINS();
        double valor, impostos = 0;

        System.out.println("Digite um valor para calcular o imposto");
        valor = sc.nextDouble();

        System.out.println("O valor do ICMS é: " + df.format(icms.calculaImposto(valor)));
        impostos+=icms.calculaImposto(valor);

        System.out.println("O valor do IPI é: " + df.format(ipi.calculaImposto(valor)));
        impostos+=ipi.calculaImposto(valor);

        System.out.println("O valor do COFINS é: " + df.format(cofins.calculaImposto(valor)));
        impostos+=cofins.calculaImposto(valor);

        System.out.println("O valor final com o somatório dos impostos é: " + df.format((valor + impostos)));
    }
}
