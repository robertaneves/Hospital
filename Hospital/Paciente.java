package Hospital;

import java.util.Scanner;

public class Paciente extends Pessoa {
    private Float renda;
    private String planoDeSaude;

    public Paciente () {

    }

    public Paciente(String nome, String cpf, String telefone) {
        super(nome, cpf, telefone);

    }

    @Override
    public void cadastrar() {
        super.cadastrar();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua renda: ");
        Float renda = scanner.nextFloat();

        scanner.nextLine();
 
        System.out.println("Qual o seu plano de saúde? ");
        String planoDeSaude = scanner.nextLine();

        this.renda = renda;
        this.planoDeSaude = planoDeSaude;

    }

    @Override
    public void exibir() {
        super.exibir();

        System.out.println("Renda: " + this.renda);
        System.out.println("Plano de Saúde: " + this.planoDeSaude);
    }
}
