package semana3.testes_codigo5;

public class Main {
    public static void main(String[] args) {
        
        Carro carro = new Carro("Nissan 360z");
        
        Carro.motor motor2z = carro.new motor("500 cavalos", "2jz");
        System.out.println("Modelo do carro: "+ carro.getModeloCarro());
        System.out.println("Potencia do motor: "+ motor2z.getPotencia());
        System.out.println("Modelo do motor: "+ motor2z.getModelo());
        motor2z.barulhoMotor();
    }

}
