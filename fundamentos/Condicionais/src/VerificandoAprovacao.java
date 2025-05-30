import java.util.Scanner;

public class VerificandoAprovacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a média da nota");
        double media = sc.nextDouble();

        if (media >= 7.0){
            System.out.println("O estudante teve média " + media + " e foi aprovado. ");
        } else if (media >= 5.0 && media <= 6.9) {
            System.out.println("O estudante teve média " + media + " e está de recuperação. ");
        }else {
            System.out.println("O estudante teve média " + media + " e foi reprovado. ");
        }
    }
}
