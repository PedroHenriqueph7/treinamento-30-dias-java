package semana3.testes_codigo.aplicacao;


import static semana3.testes_codigo.objetos.Pessoa.imprimirSaudação;

import java.util.Scanner;

import semana3.testes_codigo.objetos.Aluno;
import semana3.testes_codigo.objetos.Endereco;
import semana3.testes_codigo.objetos.Pessoa;
import semana3.testes_codigo.objetos.Professor;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         // instancia de uma pessoa com um endereço atribuido
         Endereco endereco = new Endereco("Napoleão de Santana", "SP", 5644222);
         Pessoa pessoa = new Pessoa("Luna", 25, endereco);

        // instancia de um aluno e sua matricula 
        Endereco endereco2 = new Endereco("Rua florence", "Santa Catarina", 38283);
        Aluno aluno = new Aluno("Pedro", 19, endereco2, 234);
       
    
        // teste do construtor vazio
        Pessoa pessoa2 = new Pessoa();
        
        // testando os metodos 
        aluno.mostrarDados();
        pessoa2.cumprimentar();
        pessoa.mostrarDados();
        pessoa.imprimir();
        System.out.println();
        imprimirSaudação();
        // Retornando um array de pessoas 
        final int NUMERO_MAXIMO_PESSOAS = 5;
        Pessoa[] arrayPessoas = new Pessoa[NUMERO_MAXIMO_PESSOAS];
        Endereco[] arrayEnderecos = new Endereco[NUMERO_MAXIMO_PESSOAS];

       
        for(int i = 0; i < arrayPessoas.length; i++){

            System.out.println("Informe seu nome e a sua idade: ");
            String nome = sc.nextLine();
            int idade = sc.nextInt();
            sc.nextLine();
            System.out.println("Informe seu endereço: Rua/cidade/cep ");
            arrayEnderecos[i] = new Endereco(sc.nextLine(), sc.nextLine(), sc.nextInt());
            
            arrayPessoas[i] = new Pessoa(nome, idade, arrayEnderecos[i]);
            sc.nextLine();
        }
        
        System.out.println();
        for (Pessoa p : arrayPessoas) {
                p.mostrarDados();
        }
        
        // Atribuicao do Professor no Codigo
        Endereco endereco3 = new Endereco("Rua Vieira Lima", "Brasilia", 2875);
        Pessoa professor = new Professor("Raimundo", 40, endereco3, "Matematica");
    
        professor.mostrarDados();
        
        sc.close();
    } 
    
}
