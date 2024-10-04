package semana4.codigos_nao_completos;

import java.util.Scanner;


public class Pilha {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        menuPilha();
        
        if (menuPilha() == 1)
           empilhar();
        else if (menuPilha() == 2)
           desempilhar();
        else 
           System.out.println("Saindo do Programa");

        scanner.close();
    }

    public static  void empilhar(){

    }

    public static void desempilhar(){

    }

    public static void mostrarPilha(){

    }

    public static int menuPilha(){
          Scanner scanner = new Scanner(System.in);
          System.out.println("Escolha uma opção");
          System.out.println("1 Empilhar");
          System.out.println("2 Desempilhar");
          System.out.println("0  Sair do programa");
          int escolha = scanner.nextInt();
          scanner.close();

          return escolha;
    }


}
