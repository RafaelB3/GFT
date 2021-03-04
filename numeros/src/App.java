import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double numeros[] = new double[5];
        Scanner sc = new Scanner(System.in);
        double maior, menor;

        System.out.println("Digite 5 numeros");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextDouble();
        }

        menor = numeros[0];
        maior = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        if (menor == maior) {
            System.out.println("os números são iguais");
        } else {
            System.out.println("O Menor número é: " + menor);
            System.out.println("O Maior númeor é: " + maior);
        }

    }
}
