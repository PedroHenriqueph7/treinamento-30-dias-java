package semana3.tests_cod2.objetos;

public class Operador extends Funcionario {

    public Operador(String nome, String matricula) {
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
        return "Operador: "+ getNome()+"\nMatricula: "+ getMatricula();
    }
    
    
}
