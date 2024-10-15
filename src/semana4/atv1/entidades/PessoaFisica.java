package semana4.atv1.entidades;

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
