public class ClassificacaoCategoria {
    public static void main(String[] args) {
        double preco = 150;
        if (preco <= 50.00){
            System.out.println("Categoria do produto: Econômico");
        } else if (preco > 50.00 && preco <= 200.00) {
            System.out.println("Categoria do produto: Intermediário");
        }else {
            System.out.println("Categoria do produto: Premium");
        }
    }
}
