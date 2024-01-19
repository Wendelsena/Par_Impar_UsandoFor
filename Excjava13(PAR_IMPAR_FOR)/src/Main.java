import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um valor inteiro");
        int X = sc.nextInt();

        System.out.println("Dentro de " + X + " os valores Impares são:\n ");

        if (X != 0) {
            for (int i = 0; i <= X; i++) {
                if (i % 2 != 0) {
                    System.out.println(i + " É impar");
                }
            }
        } else {
            System.out.println("Número nulo");
        }

        sc.close();
    }
}
