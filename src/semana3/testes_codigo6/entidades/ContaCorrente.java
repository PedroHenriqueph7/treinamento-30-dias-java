package semana3.testes_codigo6.entidades;

public class ContaCorrente extends Conta{

    public ContaCorrente(String agencia, int conta) {
        super(agencia, conta);
    }

    @Override
    public void exibirSaldo() {
        System.out.printf("Exibindo saldo da conta Corrente: %.2f\n",getSaldo());
    }
    
}
