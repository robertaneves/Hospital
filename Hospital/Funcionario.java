package Hospital;

import java.util.Scanner;

public class Funcionario extends Pessoa {
    
    private String escolaridade;
    private String admissao;

    public Funcionario() {

    }

    public Funcionario(String nome, String cpf, String telefone, String escolaridade, String admissao) {
        super(nome, cpf, telefone);
        this.escolaridade = escolaridade;
        this.admissao = admissao;
    }

    @Override
    public void cadastrar() {
        super.cadastrar();
        Scanner scanner = new Scanner(System.in);
      
        System.out.println("Escolaridade:");
        String escolaridade = scanner.nextLine();

        System.out.println("Admissão:");
        String admissao =  scanner.nextLine();
     
        this.escolaridade = escolaridade;
        this.admissao = admissao;
        
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Escolaridade: " + this.escolaridade);
        System.out.println("Admissão: " + this.admissao);
    }

   

}
