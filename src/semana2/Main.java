package semana2;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Informe a quantidade de idades a serem inseridas!");
        int quantidade = scanner.nextInt();

        int idade = 0;
        double media = 0;
        int i = 0;
        int somaIdades = 0;

        System.out.println("Informe as idades: ");
        while( i  < quantidade){
            i++;
            idade = scanner.nextInt();
            somaIdades += idade;
        }
        media = somaIdades / quantidade;
        System.out.println("Média das idades: "+ media);
        scanner.close();
     }
    
}