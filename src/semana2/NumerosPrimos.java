package semana2;

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int primo = scanner.nextInt();
        String numero = "Número não Primo";
        for(int i = 1; i < 50; i++){
            if(primo % i == 0 && primo % 2 != 0 || primo == 2)
               numero = "Número Primo";
               
        }
        
        System.out.println(numero);
        scanner.close();
    }
}
