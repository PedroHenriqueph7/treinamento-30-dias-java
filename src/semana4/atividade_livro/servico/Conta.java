package semana4.atividade_livro.servico;

import semana3.testes_codigo.objetos.Pessoa;


public class Conta{
    private Double saldo;
    private int    agencia;
    private String numeroConta;
    private Object titular;
    private String tipoConta;
    
    public Conta() {
        
    }
    
    public Conta(int agencia, String numeroConta, Object titular, String tipoConta) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.tipoConta = tipoConta;
    }


    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Pessoa getPessoa() {
        return (Pessoa) titular;
    }

    public void setPessoa(semana4.atividade_livro.entidades.Pessoa pessoa2) {
        this.titular = pessoa2;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public void sacar(double valorSaque) throws Exception{
        if (saldo >= valorSaque)
           this.saldo -= valorSaque;
        else
           throw new Exception("Saldo Insuficiente");
    }

    public void depositar(double valorDeposito){
          this.saldo += valorDeposito;
    }

    public void verificarSaldo(){
         System.out.println("Saldo da Conta: "+ getSaldo());
    }

    public void transferir(int agencia, String numeroContaDestino, double valor) throws Exception{
          if (getAgencia() == agencia && getNumeroConta().equals(numeroContaDestino))
              this.saldo += valor;
          else
             throw new Exception("Conta não encontrada! Verifique se os dados estão corretos");
    }

    @Override
    public String toString() {
        return "Informações da Conta: \nsaldo: " + saldo + ", numeroConta: " + numeroConta + ", Titular: " + titular + ", tipoConta: "
                + tipoConta;
    }

    

    


    
    
    
    
}
