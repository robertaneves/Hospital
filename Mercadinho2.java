import java.util.HashMap;
import java.util.Scanner;

public class Mercadinho2 {

    static class Produto {

        private String nome;
        private int id;
        private double precoVenda;
        private double precoCompra;
        
        public Produto (String nome, int id, double precoVenda, double precoCompra) {
            this.nome = nome;
            this.id = id;
            this.precoVenda = precoVenda;
            this.precoCompra = precoCompra;
        }

        public void mostrarInformações() {
            System.out.println("ID: " + id);
            System.out.println("Nome: " + nome);
            System.out.println("Preço venda: " + precoVenda);
            System.out.println("Preço compra: " + precoCompra);
            System.out.println("*******************************");
        }
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        HashMap<Integer, Produto> produtos = new HashMap<>();
        produtos.put(1, new Produto("Arroz", 1, 5.60, 2.45));
        produtos.put(2, new Produto("Feijão", 2, 12.60, 6.45));
        produtos.put(3, new Produto("Macarrão", 3, 8.60, 4.10));
        produtos.put(4, new Produto("Ovos", 4, 20.00, 5.40));
        produtos.put(5, new Produto("Atum", 5, 9.60, 8.75));

        while (true) {
            System.out.println("\nMenu:");            
            System.out.println("1. Listar todos os produtos");            
            System.out.println("2. Procurar produto por Id: ");            
            System.out.println("3. Sair"); 
            System.out.println("Escolha uma opçao: ");
            int opcao = teclado.nextInt();
            
        switch (opcao) {
            case 1:
                System.out.println("\nProdutos cadastrados: ");
                for(Produto produto : produtos.values()) {
                    produto.mostrarInformações();
                }
                break;

            case 2: 
                System.out.println("\nDigite o id do produto:");
                int idBusca = teclado.nextInt();
                Produto produtoEncontrado = produtos.get(idBusca);
                    if (produtoEncontrado != null) {
                        System.out.println("\nProduto encontrado");
                        produtoEncontrado.mostrarInformações();                        
                    } else {
                        System.out.println("\nProduto com id: " + idBusca +" " + "Não encontrado ");
                    }
                break;

            case 3:
            System.out.println("Encerrando o programa... ");
            teclado.close();
            return;

            default:
                    System.out.println("Opção invalida. Tente novamente.");
        }


    }
}

}