public class CadastroLivros {
    public static void main(String[] args) {
        String titulo = "O Pequeno Príncipe";
        String autor = "Antoine de Saint-Exupéry";
        int numeroPaginas = 96;
        double preco = 39.90;
        char categoria = 'F';

        String descricao;

        if (categoria == 'F') {
            descricao = "Ficção";
        } else if (categoria == 'N') {
            descricao = "Não Ficção";
        } else if (categoria == 'T') {
           descricao = "Tecnologia";
        } else if (categoria == 'H') {
            descricao = "História";
        }else {
            descricao = "Categoria não correspondente";
        }
        System.out.println("Livro cadastrado: " + titulo + ", de " + autor + ". Ele possui " + numeroPaginas + " páginas, custa R$" + preco + " e pertence à categoria " + descricao + ".");    }
}
