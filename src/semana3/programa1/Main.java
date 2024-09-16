package semana3.programa1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno("Pedro", 19, 234);

        Pessoa pessoa = new Pessoa("Luna", 25);

        Pessoa pessoa2 = new Pessoa();
         
        aluno.mostrarDados();
        pessoa.imprimirSaudação();
        pessoa2.cumprimentar();
        pessoa.mostrarDados();

        final int NUMERO_MAXIMO_PESSOAS = 5;
        Pessoa[] arrayPessoas = new Pessoa[NUMERO_MAXIMO_PESSOAS];
        
        for(int i = 0; i < arrayPessoas.length; i++){
            arrayPessoas[i] = new Pessoa(sc.next(), sc.nextInt());
        }

        for (Pessoa p : arrayPessoas) {
            p.mostrarDados();
        }
        sc.close();
    }
   
    
}
