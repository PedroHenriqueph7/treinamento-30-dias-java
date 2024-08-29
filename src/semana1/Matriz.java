package semana1;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho = 3;
        int[][] matriz = new int[tamanho][tamanho];
        //  estrutura de repetição for com objetivo de inserir dados na matriz
        for(int i = 0; i < tamanho; i++){
            for(int j = 0; j < tamanho; j++){
                matriz[i][j] = scanner.nextInt();
            }
        }
        // estrutura de repetição for com objetivo de mostrar na tela a matriz
        System.out.println("Matriz: ");
        for(int i = 0; i < tamanho; i++){
            for(int j = 0; j < tamanho; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }  
        // diagonal principal da matriz
        System.out.println("Diagonal principal: ");      
        for(int i = 0; i < tamanho; i++){
            for(int j = 0; j < tamanho; j++){
                if(i == j ){
                    System.out.print(matriz[i][j]);
                }
            }
            System.out.println();
        }    
        
        scanner.close();
    }
}
