package semana3.tests_cod7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // testando exceções personalizadas  
        Scanner scanner = new Scanner(System.in);

        int idade = scanner.nextInt();
        try {
        
         verificarIdade(idade);

        
        } catch (IdadeException e) {
                 System.err.println(e.getMessage());
        }finally{
             scanner.close();
        }

        
    }

    private static void verificarIdade(int idade) throws IdadeException{
        if(idade < 0)
           throw new IdadeException("O valor para idade não pode ser menor que 0");
        else if(idade >= 18)
           System.out.println("A pessoa na qual informou a idade é de maior");
        else
           System.out.println("A pessoa na qual informou a idade é de menor");  
    }
    
}
