package semana3.tests_cod3.aplication;

import semana3.tests_cod3.funcionalidades.IgualdadeObjeto;
import semana3.tests_cod3.objetos.Pessoa;

public class Main {
    public static void main(String[] args) {
       
       Pessoa pessoa1 = new Pessoa("Pedro", 19);

       Pessoa pessoa2 = new Pessoa("Pedro", 18);
      
       IgualdadeObjeto objeto = new IgualdadeObjeto();
       boolean resultado = objeto.verificarAIgualdadeObjeto(pessoa1, pessoa2);

       System.out.println("True - Objetos iguais, False - Objetos diferentes, o retorno é: "+ resultado);
       System.out.println("Dia preferido da Semana: "+pessoa1.getDiaPreferido());
       System.out.println("Dia da Semana: "+pessoa1.getDiaPreferido());
    
    }
}