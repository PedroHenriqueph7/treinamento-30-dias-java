package semana3.tests_cod2.aplicacao;

import java.util.Scanner;
import semana3.tests_cod2.objetos.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final int NUMERO_MAXIMO_PESSOAS = 5;
        Funcionario[] arraysFuncionarios = new Funcionario[NUMERO_MAXIMO_PESSOAS];
        
        // criando um array de Funcionario que armazene objetos de ambos os tipos
        for(int i = 0; i < NUMERO_MAXIMO_PESSOAS; i++){
            System.out.println("Informe o seu nome e a sua matricula: ");
            arraysFuncionarios[i] = new Gerente(scanner.nextLine(), scanner.nextLine());
            
            if(i < 4){
                i++;
                System.out.println("Informe o seu nome e a sua matricula: ");
                arraysFuncionarios[i] = new Operador(scanner.nextLine(), scanner.nextLine());
            }
            
        }

        for (Funcionario funcionario : arraysFuncionarios) {
            System.out.println(funcionario);
        }

        scanner.close();
    }
}
