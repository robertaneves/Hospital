package Hospital;

import java.util.Scanner;

public class Medico extends Funcionario{
    
    private Integer CRM;
    private String especialidade;

    public Medico() {

    }

    public Medico(String nome, String cpf, String telefone, String escolaridade, String admissao, Integer CRM,
            String especialidade) {
        super(nome, cpf, telefone, escolaridade, admissao);
        this.CRM = CRM;
        this.especialidade = especialidade;
    }

    @Override
    public void cadastrar() {
        super.cadastrar();

        Scanner scanner = new Scanner(System.in);
        System.out.println("CRM: ");
        Integer CRM = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Especialidade: ");
        String especialidade = scanner.nextLine();

        this.CRM = CRM;
        this.especialidade = especialidade;

    
    }

    @Override
    public void exibir() {
        super.exibir();

        System.out.println("CRM: " + this.CRM);
        System.out.println("Especialidade: " + this.especialidade);
    }


}
