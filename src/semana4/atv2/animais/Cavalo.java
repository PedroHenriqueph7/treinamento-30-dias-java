package semana4.atv2.animais;

public class Cavalo extends Animal {

    public Cavalo(String nomeAnimal, int idade) {
        super(nomeAnimal, idade);
    }

    @Override
    public void locomover() {
                System.out.println("Cavalo se locomovendo");
    }

    @Override
    public void emetirSom() {
        System.out.println("Rinch rinch Rinch");
    }

    @Override
    public String toString() {
        return "Cavalo = "+ getNomeAnimal() +" Idade = "+getIdade();
    }
    
    
}
