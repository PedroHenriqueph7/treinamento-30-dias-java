package semana3.tests_cod6.entidades;

public abstract class Conta {
    private String agencia;
    private int conta;
    private double saldo;

    public Conta(String agencia, int conta) {
        this.agencia = agencia;
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor){
        if(saldo >= valor){
          this.saldo -= valor; 
        }else{
          System.out.println("Saldo Insuficiente");
        }
    }

    public void depositar(double valor){
        this.saldo += valor;
    }
    
    public abstract void exibirSaldo();

}
