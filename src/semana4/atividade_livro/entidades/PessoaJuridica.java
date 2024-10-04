package semana4.atividade_livro.entidades;

public class PessoaJuridica extends Pessoa{

    private String cnpj;

    public PessoaJuridica(String nomePessoa, Endereco endereco, String telefone, String cnpj) {
        super(nomePessoa, endereco, telefone);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }
    
}
