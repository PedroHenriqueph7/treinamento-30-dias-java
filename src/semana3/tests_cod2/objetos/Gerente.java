package semana3.tests_cod2.objetos;

public class Gerente extends Funcionario{

    public Gerente(String nome, String matricula) {
        super(nome, matricula);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void calcularSalario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularSalario'");
    }

    @Override
    public String toString() {
        return "Gerente: "+ getNome()+"\nMatricula: "+ getMatricula();
    }
    
    
}
