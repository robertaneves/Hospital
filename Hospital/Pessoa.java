package Hospital;

import java.util.Scanner;

public abstract class Pessoa {
    
    private String nome;
    private String cpf;
    private String telefone;
    
    public Pessoa() {
        
    }
    
    public Pessoa(String nome, String cpf, String telefone) {
        
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }
    
    public void exibir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Telefone: " + this.telefone);
        
    }
    
    public void cadastrar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        this.nome = scanner.nextLine();
        System.out.println("Digite o seu CPF: ");
        this.cpf = scanner.nextLine();
        System.out.println("Digite o seu telefone: ");
        this.telefone = scanner.nextLine();
     
        
    }
    
    
}
