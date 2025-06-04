import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declaração de arrays para armazenar os nomes dos vendedores e seus respectivos valores de vendas
        String[] vendedores = {"Carlos", "Mariana", "João", "Fernanda"};
        double[] vendas = {4000.00, 8000.00, 12000.00, 5000.00};

        // Laço de repetição 'for' para iterar sobre os vendedores
        // Neste caso, estamos ignorando o vendedor 'Mariana' usando a instrução 'continue'
        for (int i = 0; i < vendedores.length; i++) {
            if (vendedores[i].equalsIgnoreCase("Mariana")){
                continue;
            }
            // Imprime o nome do vendedor e sua respectiva comissão
            System.out.printf("%s - comissão %.2f\n", vendedores[i], calcularComissao(vendas[i]));
        }

        // Teste usando o laço de repetição 'while'
        System.out.println("\n Teste usando while");
        int j = 0;
        boolean imprimeOutro = true;

        // Criação de um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Laço de repetição 'do-while' para imprimir os vendedores e perguntar se o usuário deseja imprimir outro
        do {
            System.out.printf("%s - comissão %.2f\n", vendedores[j], calcularComissao(vendas[j]));
            j++;
            System.out.println("Deseja imprimir outro?");
            imprimeOutro = sc.nextBoolean();
        } while (imprimeOutro);

        // Imprime todos os nomes dos vendedores usando o laço de repetição 'for-each'
        System.out.println("Todos os nomes");
        for (String nomeVendedor: vendedores){
            System.out.println("Nome" + nomeVendedor);
        }

    }

    // Método para calcular a comissão de um vendedor com base no total de vendas
    public static double calcularComissao(double totalVendas) {
        if (totalVendas <= 5000) {
            return totalVendas * 0.3;
        } else if (totalVendas <= 10000) {
            return totalVendas * 0.5;
        } else {
            return totalVendas * 0.7;
        }
    }
}