package semana3.testes_codigo.objetos;


public class Professor extends Pessoa{
    private String disciplina;

    public Professor(String nome, int idade, Endereco endereco, String disciplina) {
        super(nome, idade, endereco);
        this.disciplina = disciplina;
    }

    public String getDisciplina() { return disciplina; }

    @Override
    public void mostrarDados(){
        System.out.println("Dados da Pessoais\nNome: "+ getNome() +", Idade: "+ getIdade() +" anos, Pais: "+ PAIS+"\nEndereço: "+getEndereco()+"\nDisciplina: "+getDisciplina());
    }

}
