import java.util.Scanner;

public class ComparandoDoisNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("O maior número é " + numero1);
        } else if (numero1 < numero2) {
            System.out.println("O maior número é " + numero2);
        } else {
            System.out.println("Número 1 = " + numero1 + " e número 2 = " + numero2 + " são iguais.");
        }

        scanner.close();
    }
}
