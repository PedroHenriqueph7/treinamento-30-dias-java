package semana4.atividade_livro.entidades;

public class PessoaFisica extends Pessoa {

    private String cpf;

    public PessoaFisica(String nomePessoa, Endereco endereco, String telefone, String cpf) {
        super(nomePessoa, endereco, telefone);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
    
}
