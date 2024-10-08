package semana4.atividade_livro.servico;

import semana3.testes_codigo.objetos.Pessoa;


public class Conta{
    // atributos
    private Double saldo;
    private int    agencia;
    private String numeroConta;
    private Object titular;
    private String tipoConta;
    final private static double LIMITE_DE_TRANSFERENCIA = 3000.00;
    final private static double LIMITE_DO_SAQUE = 1000.00;
    private double taxaJuros;
    
    // construtores
    public Conta() {
        
    }
    
    public Conta(int agencia, String numeroConta, Object titular, String tipoConta) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.tipoConta = tipoConta;
    }

    // metodos acessores
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

    public void setPessoa(Pessoa titular) {
        this.titular = titular;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    // funcionalidades da conta 
    public void sacar(double valorSaque) throws Exception{
        if (valorSaque > LIMITE_DO_SAQUE)
            throw new Exception("Valor do saque acima do limite permitido");
        else if (saldo >= valorSaque){
           this.saldo -= valorSaque;
           System.out.println("Saque efetuado com sucesso no valor de "+ valorSaque);
        }else
           throw new Exception("Saldo Insuficiente!!");
    }

    public void depositar(double valorDeposito){
          this.saldo += valorDeposito;
          System.out.println("Deposito realizado com sucesso no valor de "+ valorDeposito);
    }

    public void verificarSaldo(){
         System.out.println("Saldo da Conta: "+ getSaldo());
    }

    public void transferir(Conta contadeDestino, int agencia, String numeroContaDestino, double valordaTrasferencia) throws Exception{
        
          if (valordaTrasferencia > LIMITE_DE_TRANSFERENCIA)
              throw new Exception("Valor da transferência acima do limite");
          else if (valordaTrasferencia > getSaldo())
              throw new Exception("Saldo insuficente para transferência");
          else if (contadeDestino.getAgencia() == agencia && contadeDestino.getNumeroConta().equals(numeroContaDestino)){
              contadeDestino.saldo += valordaTrasferencia;
              this.saldo -= valordaTrasferencia;
          }else
             throw new Exception("Conta não encontrada! Verifique se os dados estão corretos");
    }

    // retorno do objeto conta
    @Override
    public String toString() {
        return "Informações da Conta: \nsaldo: " + saldo + ", numeroConta: " + numeroConta + ", Titular: " + titular + ", tipoConta: "
                + tipoConta;
    }

    

    


    
    
    
    
}
