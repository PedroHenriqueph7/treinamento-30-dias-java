package semana4.atv2.animais;

public class Preguica extends Animal{

    public Preguica(String nomeAnimal, int idade) {
        super(nomeAnimal, idade);
       
    }

    @Override
    public void locomover() {
        System.out.println("preguiça se locomovendo devagar");
    }

    @Override
    public void emetirSom() {
        System.out.println("Aaaaaaaooo Aaaaoo Aaaoaooo");
    }

    @Override
    public String toString() {
        return "Preguica = "+ getNomeAnimal() +" Idade = "+getIdade();
    }
    
    
}
