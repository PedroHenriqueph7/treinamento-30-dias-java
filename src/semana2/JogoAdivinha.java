package semana2;
import java.util.Scanner;
import java.util.Random;


public class JogoAdivinha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio = gerarNumeroAleatorio(1, 100);
        int numeroInformadoPeloUsuario = 0;

        do {
           System.out.println("Adivinhe o número gerado de 1 a 100 pelo Robo!");
           numeroInformadoPeloUsuario = scanner.nextInt();
            
           if (numeroAleatorio > numeroInformadoPeloUsuario)
              System.out.println("O número aleatório gerado pelo robo é Maior!");
           else if (numeroAleatorio < numeroInformadoPeloUsuario)
              System.out.println("O número aleatório gerado pelo robo é Menor!");

        } while (numeroAleatorio != numeroInformadoPeloUsuario);

        System.out.println("---------------------------------------------------");
        System.out.println("PARABÉNS VOCÊ INFORMOU O NÚMERO CORRETO!!!");
        System.out.println("---------------------------------------------------");
        scanner.close();
    }

    public static int gerarNumeroAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
    

}