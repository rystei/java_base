import java.util.Scanner;

public class NumeroIntervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do empréstimo entre 1000 a 5000 reais: ");
        double emprestimo = sc.nextDouble();

        if (emprestimo >= 1000 && emprestimo <= 5000) {
            System.out.println("O valor " + emprestimo + ", está dentro do intervalo permitido para empréstimo. \nempréstimo permitido ");
        } else {
            System.out.println("O valor " + emprestimo + ", não está dentro do intervalo permitido para empréstimo. ");
        }

        sc.close();
    }
}
