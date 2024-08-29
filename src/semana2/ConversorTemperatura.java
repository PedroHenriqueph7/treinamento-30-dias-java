package semana2;

import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
    
        System.out.print("Informe para qual temperatura deseja converte: \n1 para Celsius(C) \n2 para Farenheit(F)\n\n");
        int conversao = scanner.nextInt();
        double temperatura = 0.0;
        double temperaturaConvertida = 0;

        if(conversao == 1 || conversao == 2){
        System.out.println("Informe a temperatura: ");
        temperatura = scanner.nextDouble();
        }
        
        if( conversao == 1 ){
            // Temperatura convertida de farenheit para Celsius
           temperaturaConvertida = (temperatura - 32) * 5/9;
           System.out.println("A temperatura convertida é: "+temperaturaConvertida+"°C");
        }else if( conversao == 2 ){
            // Temperatura convertidade de celsius para Farenheit
            temperaturaConvertida = (temperatura * 1.8) + 32;
            System.out.println("A temperatura convertida é: "+temperaturaConvertida+"°F");
        }else{
            System.out.println("Número invalido! \nInforme 1 ou 2 para conversão");
        }
    
        scanner.close();
    }
}
