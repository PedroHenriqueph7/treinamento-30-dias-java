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
        Endereco endereco = new Endereco(null, 0, null, null);
          Pessoa p = new Pessoa(null, null, null);
          PessoaFisica pf = new PessoaFisica(null, null, null, null);
          PessoaJuridica pj = new PessoaJuridica(null, null, null, null);
          Conta conta = new Conta();
          conta.setSaldo(20.00);
          CaixaEletronico caixa = new CaixaEletronico();
          
          caixa.verificarSaldo();
          
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

    public void verificarSaldo(){
         System.out.println(conta.getSaldo());
    }

    public void transferir(Conta numeroContaDestino, double valor){

    }
 


}
