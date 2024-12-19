package Hospital;

import java.util.Scanner;

class FuncionarioRH extends Funcionario {

    private String setorRH;
    private String codigoEmpresa;


    public FuncionarioRH() {
       
    }

    public FuncionarioRH(String nome, String cpf, String telefone, String escolaridade, String admissao, String setorRH,
            String codigoEmpresa) {
        super(nome, cpf, telefone, escolaridade, admissao);
        this.setorRH = setorRH;
        this.codigoEmpresa = codigoEmpresa;
    }

    @Override
    public void cadastrar() {
        super.cadastrar();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Setor do RH: ");
        String setorRH = scanner.nextLine();

        System.out.println("Código da Empresa: ");
        String codigoEmpresa =  scanner.nextLine();

        this.setorRH = setorRH;
        this.codigoEmpresa = codigoEmpresa;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Setor do RH: " + this.setorRH);
        System.out.println("Código da empresa: " + this.codigoEmpresa);


    }

    
}