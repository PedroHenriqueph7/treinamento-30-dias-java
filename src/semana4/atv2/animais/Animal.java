package semana4.atv2.animais;

public abstract class Animal {

    private String nomeAnimal;
    private int idade;
    
    public Animal(String nomeAnimal, int idade) {
        this.nomeAnimal = nomeAnimal;
        this.idade = idade;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public abstract void locomover();

    public abstract void emetirSom();

    @Override
    public String toString() {
        return "Animal [nomeAnimal= " + nomeAnimal + ", idade= " + idade + "]";
    }

    
}
