package semana4.estrutura_de_dados;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        Scanner scanner = new Scanner(System.in);
        pilha.menuPilha();
        int escolha = scanner.nextInt();
        int num;
        try {
            while (escolha != 0){
                if (escolha == 1){
                    num = scanner.nextInt();    
                    pilha.empilhar(num);
                } else if (escolha == 2) {
                        pilha.desempilhar();
                } else if (escolha == 0) {
                    System.out.println("Saindo do Programa");
                } else {
                    System.out.println("Erro número Inválido, escolha os valores do Menu de Opções ");
                }
    
                pilha.menuPilha();
                escolha = scanner.nextInt();
           }
        } catch (PilhaException e) {
                System.err.println(e.getMessage());
        } finally{
            scanner.close();
        }
       
        
    }
}
