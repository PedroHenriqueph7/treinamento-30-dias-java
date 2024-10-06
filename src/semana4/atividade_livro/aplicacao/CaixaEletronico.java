package semana4.atividade_livro.aplicacao;

import java.util.ArrayList;

import semana4.atividade_livro.entidades.Endereco;
import semana4.atividade_livro.entidades.Pessoa;
import semana4.atividade_livro.entidades.PessoaFisica;
import semana4.atividade_livro.entidades.PessoaJuridica;
import semana4.atividade_livro.servico.Conta;



public class CaixaEletronico{
    
    ArrayList<Conta> arraysConta = new ArrayList<>();
 
    public static void main(String[] args) {
        
        try {
            Endereco endereco = new Endereco("Rua Ficticia xxxx", 45, "Cidade xxx", "SP");
            Endereco endereco2 = new Endereco("Rua Ficticia yyyy", 36, "Cidade yyy", "SP");
            Endereco endereco3 = new Endereco("Rua Ficticia llll", 68, "Cidade aaa", "SP");
    
            
              Pessoa pessoa = new Pessoa("Pedro", endereco, "11 981111111");
              Conta conta = new Conta(1111, "2222-2", pessoa, "poupança");
              conta.setSaldo(900.00);
              
              
              Pessoa pf = new PessoaFisica("Luiz", endereco2, "11 972222222", "113.333.333-00");
              Conta conta2 = new Conta(2222, "3333-3", pf, "poupança");
              conta2.setSaldo(1300.00);
              
    
              PessoaJuridica pj = new PessoaJuridica("João", endereco3, "11 955555554", "11-3333/0000-00");
              Conta conta3 = new Conta(3333, "4444-4", pj, "corrente");
              conta3.setSaldo(2099.00);
              
             
              System.out.println(conta);
              System.out.println(conta2);
              System.out.println(conta3);
               
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }     
    }
}
