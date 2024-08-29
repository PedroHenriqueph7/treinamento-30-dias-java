package semana2;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe um número a qual deseja o seu fatorial!");
        int  numero = scanner.nextInt();
        int fat = numero;
        for(int fatorial = numero; fatorial > 1; fatorial--){
            numero--;
            fat*= numero;
            
        }
        System.out.println(fat);


        scanner.close();
    }
}
