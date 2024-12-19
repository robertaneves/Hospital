package Hospital;


public class Main {
    public static void main(String[] args) {
      
        Medico medico = new Medico();
        medico.cadastrar();
        medico.exibir();
      
        Paciente paciente = new Paciente();
        paciente.cadastrar();
        paciente.exibir();
     
        
    }
}
