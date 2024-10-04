package semana4.atividade_livro.entidades;

public class Endereco {
    private String rua;
    private int numero;
    private String cidade;
    private String uf;

    public Endereco(String rua, int numero, String cidade, String uf) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }
    
}
