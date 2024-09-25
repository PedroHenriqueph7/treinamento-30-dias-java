package semana3.testes_codigo3;



public class Main {
    public static void main(String[] args) {
       
       Pessoa pessoa1 = new Pessoa("Pedro", 19);

       Pessoa pessoa2 = new Pessoa("Pedro", 18);
      
       if (pessoa1.equals(pessoa2)) {
           System.out.println("Identificadores iguais");
       }else{
           System.out.println("Identificadores diferente");
       }

    
     System.out.println("Dia preferido da Semana: "+pessoa1.getDiaPreferido());
     System.out.println("Dia da Semana: "+pessoa1.getDiaPreferido());
    }
}
