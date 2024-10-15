package semana4.atv2.aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import semana4.atv1.Girafa;
import semana4.atv2.animais.CachorrodoMato;
import semana4.atv2.animais.Cavalo;
import semana4.atv2.animais.Preguica;

public class Zoologico {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("____________________________________");
        System.out.println("Bem-Vindo ao Zoologico de São Paulo");
        System.out.println("____________________________________");

        
        
        scanner.close();
    }

    public static void exibirMenu(){
        System.out.println("Digite 1 para visualizar a Lista de Cachorros do Mato");
        System.out.println("Digite 2 para visualizar a Lista de Cavalos");
        System.out.println("Digite 3 para visualizar a Lista de Girafas");
        System.out.println("Digite 4 para visualizar a Lista de Preguiça");
        
    }

    public static void catalogodeAnimais(){
        Scanner scanner = new Scanner(System.in);
  
        List<CachorrodoMato> listaCachorro = new ArrayList<CachorrodoMato>();
        List<Cavalo> listaCavalos = new ArrayList<Cavalo>();
        List<Girafa> listaGirafas = new ArrayList<Girafa>();
        List<Preguica> listaPreguicas = new ArrayList<Preguica>();

        listaCachorro.add(new CachorrodoMato(null, 0));
        listaCachorro.add(new CachorrodoMato(null, 0));
        listaCachorro.add(new CachorrodoMato(null, 0));

        listaCavalos.add(new Cavalo(null, 0));
        listaCavalos.add(new Cavalo(null, 0));
        listaCavalos.add(new Cavalo(null, 0));

        listaGirafas.add(new Girafa(null, 0));
        listaGirafas.add(new Girafa(null, 0));

        listaPreguicas.add(new Preguica(null, 0));
        listaPreguicas.add(new Preguica(null, 0));

        exibirMenu();
        int listaEscolhida = scanner.nextInt();
        
        if(listaEscolhida == 1){
           for ( CachorrodoMato cachorrodoMato : listaCachorro) {
              System.out.println(cachorrodoMato);
           }
        } else if (listaEscolhida == 2){
           for (Cavalo cavalo : listaCavalos) {
              System.out.println(cavalo);
           }
        } else if (listaEscolhida == 3){
           for (Girafa girafa : listaGirafas) {
               System.out.println(girafa);
           }
        } else if (listaEscolhida == 4){
           for (Preguica preguica : listaPreguicas) {
                System.out.println(preguica);
            }
        } else {

        }
        
        
        scanner.close();
    }
}
