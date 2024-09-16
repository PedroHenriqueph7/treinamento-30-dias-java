package semana3.programa1;

public class Aluno extends Pessoa{

    private int matricula;

    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public int getMatricula() {  return matricula; }

    public void mostrarDados(){
        System.out.println("Dados do Aluno\nNome:"+ getNome() + "\nidade: "+ getIdade() +"\nMatricula: "+ matricula);
    }

    
}
