package semana4.atv2.animais;

public class CachorrodoMato extends Animal {


    public CachorrodoMato(String nomeAnimal, int idade) {
        super(nomeAnimal, idade);
    }

    @Override
    public void locomover() {
        System.out.println("Cachorro se locomovendo");
    }

    @Override
    public void emetirSom() {
        System.out.println("Auauau Auauau rrrrr Auau");
    }

    @Override
    public String toString() {
        return "CachorrodoMato = "+ getNomeAnimal() +" Idade = "+getIdade();
    }

    
}
