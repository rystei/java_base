import java.util.Scanner;

public class DiaUtil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o dia da semana: ");
        String diaSemana = sc.nextLine().toLowerCase();
        sc.close();

        if (diaSemana.equals("segunda") || diaSemana.equals("terca") ||
                diaSemana.equals("quarta") || diaSemana.equals("quinta") ||
                diaSemana.equals("sexta")) {
            System.out.println(diaSemana + " é um dia útil.");
        } else {
            System.out.println(diaSemana + " não é um dia útil.");

            sc.close();
        }
    }
}
