package semana1;

import java.util.ArrayList;


public class Array {

    public static void main(String[] args) {
        
        ArrayList<Integer> arrays = new ArrayList<Integer>();
        arrays.add(2);
        arrays.add(4);
        arrays.add(1);
        arrays.add(6);
        arrays.add(8);
        arrays.add(0);

        System.out.println("Tamanho do Array: "+arrays.size());

        for (Integer vetor1 : arrays) {
            System.out.print(vetor1+" ");
        }

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        
        System.out.println();
        for (int numero : arrays) {
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);

        
    }
}
