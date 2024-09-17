package semana3.programa1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         // instancia de uma pessoa com um endereço atribuido
         Endereco endereco = new Endereco("Napoleão de Santana", "SP", 5644222);
         Pessoa pessoa = new Pessoa("Luna", 25, endereco);

        // instancia de um aluno e sua matricula 
        Endereco endereco2 = new Endereco("Rua florence", "Santa Catarina", 38283);
        Aluno aluno = new Aluno("Pedro", 19, endereco, 234);
        
        // teste do construtor vazio
        Pessoa pessoa2 = new Pessoa();
        
        // testando os metodos 
        aluno.mostrarDados();
        pessoa.imprimirSaudação();
        pessoa2.cumprimentar();
        pessoa.mostrarDados();

        // Retornando um array de pessoas 
        final int NUMERO_MAXIMO_PESSOAS = 5;
        Pessoa[] arrayPessoas = new Pessoa[NUMERO_MAXIMO_PESSOAS];
        Endereco[] arrayEnderecos = new Endereco[NUMERO_MAXIMO_PESSOAS];
        System.out.println("Informe seus Nomes e Idades: ");
        for(int i = 0; i < arrayPessoas.length; i++){
            arrayEnderecos[i] = new Endereco(sc.nextLine(), sc.nextLine(), sc.nextInt());
            arrayPessoas[i] = new Pessoa(sc.next(), sc.nextInt(), arrayEnderecos[i]);
        }
       
        for (Pessoa p : arrayPessoas) {
                p.mostrarDados();
        }
        
        sc.close();
    } 
    
}
