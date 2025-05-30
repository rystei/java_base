import java.util.Scanner;

public class ValidacaoSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senhaDefinida = "123456";

        System.out.println("Digite a senha: ");
        String senhaTentava = sc.nextLine();
        if (senhaTentava.equals(senhaDefinida)){
            System.out.println("Acesso permitido! ");
        }else {
            System.out.println("Acesso negado!");
        }

        sc.close();
    }
}
