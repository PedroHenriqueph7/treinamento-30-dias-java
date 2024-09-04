package semana2;

import java.util.Scanner;

public class SomaMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho = 3;
        int[][] matriz1 = new int[tamanho][tamanho];
        int[][] matriz2 = new int[tamanho][tamanho];
        
        System.out.println("Informe os valores da primeira matriz 3x3");
        for(int i = 0; i < tamanho; i++){
            for(int j = 0; j < tamanho; j++){
                matriz1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Informe os valores da segunda matriz 3x3");
        for(int i = 0; i < tamanho; i++){
            for(int j = 0; j < tamanho; j++){
                matriz2[i][j] = scanner.nextInt();
            }
        }

        int[][] somaMatriz = new int[tamanho][tamanho];
        // Somando a matriz 1 e 2, elemento por elememto 
        for(int i = 0; i < tamanho; i++){
            for(int j = 0; j < tamanho; j++){
               somaMatriz[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        // Impressão na tela da matriz somada
        System.out.println();
        for(int i = 0; i < tamanho; i++){
            for(int j = 0; j < tamanho; j++){
               System.out.print(somaMatriz[i][j]+" ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
