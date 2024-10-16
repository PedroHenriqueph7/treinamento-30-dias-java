package semana4.atv1.entidades;

public class Pessoa {
    protected String nomePessoa;
    protected Endereco endereco;
    protected String telefone;

    public Pessoa(String nomePessoa, Endereco endereco, String telefone) {
        this.nomePessoa = nomePessoa;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return nomePessoa;
    }
 
    
}
