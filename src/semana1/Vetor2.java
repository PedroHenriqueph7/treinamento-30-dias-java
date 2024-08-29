package semana1;

import java.util.Scanner;

public class Vetor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho = 10;
        int[] vetor = new int[tamanho];
       
        //Adicionar valores ao vetor
        for(int i = 0; i < tamanho; i++){
            vetor[i] = scanner.nextInt();
        }

        //soma das posicoes dos vetores
        int soma = 0;
        for(int i = 0; i < tamanho; i++){
            soma += vetor[i];
        }
        //Mostrar o vetor na tela
        System.out.print("[ ");
        for(int vetor1 : vetor){
            System.out.print(vetor1+" ");
        }
        System.out.println("]");

        double mediaAritmetica = soma / tamanho;
        System.out.println("Média: "+mediaAritmetica);

        scanner.close();
    }
}
