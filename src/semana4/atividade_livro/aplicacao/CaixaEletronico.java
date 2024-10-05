package semana4.atividade_livro.aplicacao;

import java.util.ArrayList;

import semana4.atividade_livro.entidades.Endereco;
import semana4.atividade_livro.entidades.Pessoa;
import semana4.atividade_livro.entidades.PessoaFisica;
import semana4.atividade_livro.entidades.PessoaJuridica;
import semana4.atividade_livro.servico.Conta;



public class CaixaEletronico {
    private Conta conta;
    private ArrayList<Conta> arraysConta = new ArrayList<>();
    public static void main(String[] args) {
        /* 
        Endereco endereco = new Endereco("Rua Olivia Miranda", 45, "São Paulo", "SP");
        Endereco endereco2 = new Endereco("Rua São Sebastião", 36, "São Paulo", "SP");
        Endereco endereco3 = new Endereco("Rua Interlagos", 68, "São Paulo", "SP");

        
          Pessoa pessoa = new Pessoa("Pedro", endereco, "11 996203382");
          Conta conta = new Conta();
          conta.setPessoa(pessoa);
          conta.setSaldo(20.00);
          conta.setNumeroConta(27384);
          conta.setTipoConta(2);

          
          Pessoa pf = new PessoaFisica("Luiz", endereco2, "11 948332940", "93849920204");
          Conta conta2 = new Conta();
          conta2.setPessoa(pf);
          conta2.setSaldo(300.00);
          conta2.setNumeroConta(3293);
          conta2.setTipoConta(1);

          PessoaJuridica pj = new PessoaJuridica("João", endereco3, "11 958372837", "19294020324");
          Conta conta3 = new Conta();
          conta3.setPessoa(pj);
          conta3.setSaldo(299.00);
          conta3.setNumeroConta(302);
          conta3.setTipoConta(3);

          System.out.println(conta);
          System.out.println(conta2);
          System.out.println(conta3);
          */

          
    }
  
    public Conta getConta() {
        return conta;
    }


    public void setConta(Conta conta) {
        this.conta = conta;
    }


    public ArrayList<Conta> getArraysConta() {
        return arraysConta;
    }


    public void setArraysConta(ArrayList<Conta> arraysConta) {
        this.arraysConta = arraysConta;
    }


    public void sacar(double valorSaque){
       
    }

    public void depositar(double valorDeposito){
        
    }

    public double verificarSaldo(){
         return conta.getSaldo();
    }

    public void transferir(Conta numeroContaDestino, double valor){

    }
 


}
