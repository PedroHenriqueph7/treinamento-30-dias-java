package semana4.estrutura_de_dados;

import java.util.Stack;

public class Pilha {

    Stack<Integer> pilha = new Stack<>();

    public void empilhar(Integer numero){
       this.pilha.push(numero);
    }
    
    public void desempilhar() throws PilhaException{
        if (!pilha.isEmpty()){
           this.pilha.pop();
        } else {
          throw new PilhaException("A pilha está vazia");
        }
       
    }

    public Stack<Integer> mostrarPilha(){
         for (Integer integer : pilha) {
             System.out.println(integer + " ");
         }

         return pilha;
    }

    public void menuPilha(){
          
          System.out.println(mostrarPilha());
          System.out.println("Escolha uma opção");
          System.out.println("1 Empilhar");
          System.out.println("2 Desempilhar");
          System.out.println("0  Sair do programa");
    
    }
}
