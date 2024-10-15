package semana3.tests_cod2.objetos;

public abstract class Funcionario {
    private String nome;
    private String matricula;
    private Gerente gerente;
    private Operador operador;
    
    
    public Funcionario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    

    public Funcionario(Gerente gerente, Operador operador) {
        this.gerente = gerente;
        this.operador = operador;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {

    }
    
    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public Operador getOperador() {
        return operador;
    }

    public void setOperador(Operador operador) {
        this.operador = operador;
    }

    public abstract void calcularSalario();



    @Override
    public String toString() {
        return "Funcionario \nGerente=" + gerente + "\nOperador=" + operador + "]";
    }
    
    
}
