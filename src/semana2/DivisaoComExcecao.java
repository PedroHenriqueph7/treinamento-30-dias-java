package semana2;

import java.util.Scanner;

public class DivisaoComExcecao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        System.out.println(divisao(num1, num2));

        scanner.close();
        } catch (Exception e) {
            System.out.println("A divisão não aceita '0' como divisor");
        }
        
    }

    public static double divisao(int num1, int num2) throws Exception {
        if(num2 == 0)
          throw new Exception();
          
        return num1 / num2;
    }
}
