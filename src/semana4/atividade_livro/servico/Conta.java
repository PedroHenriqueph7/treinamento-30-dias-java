package semana4.atividade_livro.servico;

import semana3.testes_codigo.objetos.Pessoa;

public class Conta {
    private Double saldo;
    private int numeroConta;
    private Pessoa pessoa;
    private int tipoConta;
    
    public Conta() {
        
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public int getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }

    
    
    
}
