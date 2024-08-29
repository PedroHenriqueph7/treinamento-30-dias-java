package semana2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOrdenada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List <Integer> inteiroList = new ArrayList<>();

        inteiroList.add(4);
        inteiroList.add(2);
        inteiroList.add(1);
        inteiroList.add(5);
        inteiroList.add(7);
        inteiroList.add(4);
        
       Collections.sort(inteiroList);
        
       System.out.print("Lista Ordenada: "+ inteiroList);
        
        scanner.close();
    }
}
