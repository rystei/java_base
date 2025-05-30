public class Main {
    public static void main(String[] args) {

        // - Condicionais (if, else if, else) ajudam a decidir qual código executar.
        // - Usamos 'if' para verificar uma condição e 'else' para o caso contrário.
        // - Operadores de comparação: >, <, ==, !=, >=, <=.
        // - Operadores lógicos: AND (&&) e OR (||) para combinar condições.

        String nome = "rystei";
        double salario = 2756.90;
        int numeroDependentes = 2;
        boolean isento = true;

        if (salario > 2523.45 && !isento) {
            double irff = salario / 100 * 7.5;
            System.out.printf("Valor IRRF: %.2f%n", irff);
        } else if (isento) {
            System.out.println("Contribuinte isento de IRRF.");
        } else {
            System.out.println("Não tem valor de IRRF.");
        }
    }
}