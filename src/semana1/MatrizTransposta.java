package semana1;

import java.util.Scanner;

public class MatrizTransposta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int linha = 2;
        int coluna = 3;
        int[][] matriz = new int[linha][coluna];

        for(int i = 0; i < linha; i++){
            for(int j = 0; j < coluna; j++){
                matriz[i][j] = scanner.nextInt();
            }
        }

        // matriz original
        System.out.println("Matriz: ");
        for(int i = 0; i < linha; i++){
            for(int j = 0; j < coluna; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }  

        // matriz transposta
        System.out.println("Matriz Transposta: ");
        for(int j = 0; j < coluna; j++){
            for(int i = 0; i < linha; i++){
                System.out.print(matriz[i][j]+" ");
            }
           System.out.println();
        }

        scanner.close();
    }
}
