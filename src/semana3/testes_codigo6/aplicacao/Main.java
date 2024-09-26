package semana3.testes_codigo6.aplicacao;

import java.util.Locale;

import semana3.testes_codigo6.entidades.Conta;
import semana3.testes_codigo6.entidades.ContaCorrente;
import semana3.testes_codigo6.entidades.ContaPoupanca;

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
