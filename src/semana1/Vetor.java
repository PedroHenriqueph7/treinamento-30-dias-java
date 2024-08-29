package semana1;
import java.util.Scanner;

public class Vetor {

    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
     int tamanho = 10;
     int[] vetor = new int[tamanho];

     //loop de iteração com objetivo de adicionar elemento dentro de um vetor
     for(int i = 0; i < tamanho; i++){
        vetor[i] = scanner.nextInt(); 
     }

     System.out.print("Vetor: [ ");
     for(int i = 0; i < tamanho; i++){
        System.out.print(vetor[i] +" "); 
     }
     System.out.print("]");

    int maiorValor = Integer.MIN_VALUE;
    int menorValor = Integer.MAX_VALUE;

     for(int vetor1 : vetor){
        if(maiorValor < vetor1){
            maiorValor = vetor1;
        }
        if (menorValor > vetor1){
            menorValor = vetor1;
        }
     }
     System.out.println();
     System.out.print("Maior valor do vetor: "+maiorValor);
     System.out.println();
     System.out.print("Menor valor do vetor: "+menorValor);
     scanner.close();
    }
        
   }

