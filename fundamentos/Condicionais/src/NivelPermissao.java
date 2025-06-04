import java.util.Scanner;

public class NivelPermissao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código de acesso: ");
        int codigo = sc.nextInt();
        System.out.println("Digite o nivel de acesso");
        int permissao = sc.nextInt();

        boolean codigoValido = codigo == 2023;
        boolean permissaoValido = permissao == 1 || permissao == 2 || permissao == 3;

        if (codigoValido && permissaoValido) {
            System.out.println("Acesso permitido. Bem-vindo ao sistema!");
        } else {
            System.out.println("Acesso negado.");
        }
        if (!codigoValido) {
            System.out.println("Acesso negado, código errado");
        }
        if (!permissaoValido) {
            System.out.println("Acesso negado, nivel de acesso insuficiente");

            sc.close();
        }
    }
}
