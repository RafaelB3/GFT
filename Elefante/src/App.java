import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Quanto o elefante incomoda?");
        i = sc.nextInt();
        for (int j = 0; j < i; j++) {
            System.out.print("incomoda ");
        }
        System.out.print("muito mais");
    }
}
