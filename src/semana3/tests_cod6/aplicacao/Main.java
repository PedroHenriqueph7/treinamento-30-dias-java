package semana3.tests_cod6.aplicacao;

import java.util.Locale;
import semana3.tests_cod6.entidades.*;

public class Main {
    public static void main(String[] args) {
        
        // testes na criação de contas 
        Locale.setDefault(Locale.US);
        Conta contaPoupanca = new ContaPoupanca("3-4456", 23467);

        Conta contaCorrente = new ContaCorrente("3-4456", 23467);

        contaPoupanca.exibirSaldo();
        contaCorrente.exibirSaldo();

        contaCorrente.depositar(100);
        contaPoupanca.depositar(200);

        contaCorrente.sacar(100);

       
        contaPoupanca.depositar(1000);
        contaCorrente.depositar(500);

        contaCorrente.exibirSaldo();
        contaPoupanca.exibirSaldo();
    }
}
