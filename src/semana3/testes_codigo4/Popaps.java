package semana3.testes_codigo4;

import javax.swing.JOptionPane;

public class Popaps {
    public static void main(String[] args) {

    // escrita 
    JOptionPane.showMessageDialog(null, "Olá Mundo!", null, 0);
    
    // leitura 
    String nome = JOptionPane.showInputDialog("Digite o seu nome");
    
    JOptionPane.showMessageDialog(null, "Nome digitado: "+ nome);

    int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade"));

    JOptionPane.showMessageDialog(null, "Idade digitada: "+ idade);
    }
}
