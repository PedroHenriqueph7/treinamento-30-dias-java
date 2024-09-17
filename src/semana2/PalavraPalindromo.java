package semana2;

import java.util.Scanner;
// Voltar para resolver o problema da palavra palindromo
// codigo com erro apresentado 
public class PalavraPalindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe uma palavra, para verificarmos se ela faz parte do grupo de palavras palindromos");
        String palavra = scanner.next();
        String[] palavraSeparada = palavra.split("");
        String[] palavraInvertida = new String[palavraSeparada.length];

        for(int i = palavraSeparada.length-1; i >= 0; i--){
            
            System.out.print(palavraSeparada[i]);
            palavraInvertida[i] = palavraSeparada[i];
        }

       System.out.println(palavraInvertida);
            
        scanner.close();

    }
}