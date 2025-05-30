import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Insira um número para verificação: ");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número "+ numero + " É par");
        } else {
            System.out.println("O número "+ numero + "É impar");
        }

        sc.close();
    }
    }