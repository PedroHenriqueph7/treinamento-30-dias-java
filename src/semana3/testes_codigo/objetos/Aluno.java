package semana3.testes_codigo.objetos;

public class Aluno extends Pessoa{

    private int matricula;

    public Aluno(String nome, int idade, Endereco endereco, int matricula) {
        super(nome, idade, endereco);
        this.matricula = matricula;
    }

    public int getMatricula() {  return matricula; }

    public void mostrarDados(){
        System.out.println("Dados do Aluno\nNome:"+ getNome() + "\nidade: "+ getIdade() +"\nMatricula: "+ matricula);
    }

    
}
