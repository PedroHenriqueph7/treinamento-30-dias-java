package semana3.tests_cod6.entidades;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(String agencia, int conta) {
        super(agencia, conta);
    }

    @Override
    public void exibirSaldo() {
        System.out.printf("Exibindo saldo da Conta Poupança: %.2f\n", getSaldo());
    }
    
}
