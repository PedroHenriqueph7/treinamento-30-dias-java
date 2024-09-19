package semana3.testes_de_codigo;

public class Pessoa {
    protected final static String PAIS = "Brasil";
    private String nome;
    private int idade;
    private Endereco endereco;

    
    public Pessoa(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public Pessoa(){
        
    }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }

    public void setIdade(int idade) { this.idade = idade; }
    
    public static String getPais() { return PAIS; }

    public Endereco getEndereco() { return endereco; }

    public void setEndereco(Endereco endereco) {   this.endereco = endereco; }

    
    public void mostrarDados(){
        System.out.println("Dados da Pessoais\nNome: "+ nome +", Idade: "+ idade +" anos, Pais: "+ PAIS+"\nEndereço: "+endereco);
    }

    public void cumprimentar(String nome){
        String nome1 = nome;
    }

    public void cumprimentar(){
        System.out.println("Olá");
    }

    public static void imprimirSaudação(){
       System.out.println("Bem-vindo ao nosso Lar");
       }
}
