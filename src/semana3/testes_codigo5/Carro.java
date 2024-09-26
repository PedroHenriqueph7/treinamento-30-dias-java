package semana3.testes_codigo5;

public class Carro {
    
    private String modeloCarro;
    private String ano;

    public Carro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    
    public String getModeloCarro() {
        return modeloCarro;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public class motor{
        private String potencia;
        private String modelo;

        public motor(String potencia, String modelo) {
            this.potencia = potencia;
            this.modelo = modelo;
        }

        public String getPotencia() {
            return potencia;
        }

        public String getModelo() {
            return modelo;
        }
  
        public void barulhoMotor(){
            System.out.println("Handandandannnnnnnn hann dann hannnndan");
        }
    }
}
