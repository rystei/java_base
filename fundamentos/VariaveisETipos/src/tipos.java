public class tipos {
    public static void main(String[] args) {
        // Tipos primitivos de variáveis
        int quantidadeDePassos = 500; // Exemplo de um número inteiro
        double alturaEmMetros = 1.60; // Exemplo de um número decimal

        // Tipos referenciados
        String nome = "Gustavo"; // Exemplo de texto (sequência de caracteres)

        // Escopo de variáveis (Local)
        if (quantidadeDePassos < 1000) {
            String sugestao = "Sugiro que você melhore sua meta";
            System.out.println(sugestao);
        }
        // A variável 'sugestao' só pode ser usada dentro do bloco 'if'
    }
}

/*
 * RESUMO DA AULA:
 *
 * Variáveis:
 *  - Espaços na memória para armazenar valores que podem mudar.
 *
 * Tipos de Variáveis:
 *  - Primitivos: Armazenam o valor diretamente na memória.
 *      Exemplos: byte, short, int, long, float, double, char, boolean.
 *  - Referenciados: Armazenam o endereço de memória onde o valor está.
 *      Exemplos: String, objetos de classes.
 *
 * Declaração e Inicialização:
 *  - Declarar: Definir o tipo e o nome da variável (usar Camel Case).
 *  - Inicializar: Atribuir um valor inicial (respeitar os limites do tipo).
 *
 * Conversão de Tipos:
 *  - Implícita: Automática (tipo menor para maior).
 *  - Explícita (Type Casting): Forçada (tipo maior para menor, pode perder informação).
 *      Exemplo: int alturaEmCentimetros = (int) (alturaEmMetros * 100);
 *      CUIDADO: Ordem dos cálculos no Type Casting é importante para evitar erros.
 *
 * Escopo de Variáveis:
 *  - Local: Variáveis declaradas dentro de um bloco ({}) só podem ser acessadas ali.
 */