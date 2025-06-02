import java.util.Scanner;

public class DescontoCompras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor da compra");
        double valorCompra = sc.nextDouble();

        if (valorCompra >= 100) {
            double desconto = 10.00 / 100.00 * valorCompra;
            System.out.println("Desconto de 10% aplicado.");
            System.out.println("Novo valor: R$: " + (valorCompra - desconto));
        } else {
            System.out.println("Nenhum desconto aplicado.");
            System.out.println("Valor total: R$: " + valorCompra);
        }
    }
}
