package semana4.atv1;

import semana4.atv2.animais.Animal;

public class Girafa extends Animal {

    public Girafa(String nomeAnimal, int idade) {
        super(nomeAnimal, idade);
        
    }

    @Override
    public void locomover() {
        System.out.println("Girafa se locomovendo");
    }

    @Override
    public void emetirSom() {
        System.out.println("Aeeeeoooooooou Aeeeoooou Aeeeeooooou");
    }

    @Override
    public String toString() {
        return "Girafa = "+ getNomeAnimal() +" Idade = "+getIdade();
    }
    
    
}
