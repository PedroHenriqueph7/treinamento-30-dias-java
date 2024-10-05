package semana4.atividade_livro.servico;

import semana3.testes_codigo.objetos.Pessoa;

public class Conta {
    private Double saldo;
    private int numeroConta;
    private Object pessoa;
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
        return (Pessoa) pessoa;
    }

    public void setPessoa(semana4.atividade_livro.entidades.Pessoa pessoa2) {
        this.pessoa = pessoa2;
    }

    public int getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }

    @Override
    public String toString() {
        return "Informações da Conta: \nsaldo: " + saldo + ", numeroConta: " + numeroConta + ", Titular: " + pessoa + ", tipoConta: "
                + tipoConta;
    }

    

    


    
    
    
    
}
