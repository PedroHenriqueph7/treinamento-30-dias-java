package semana3.testes_codigo3.objetos;

public enum diadeSemana {
    DOMINGO(1),
    SEGUNDA_FEIRA(2),
    TERCA_FEIRA(3),
    QUARTA_FEIRA(4),
    QUINTA_FEIRA(5),
    SEXTA_FEIRA(6),
    SABADO(7);

    private int code;

    diadeSemana(int code){
        this.code = code;
    }

    public int getCode() {
        return code;
    }
    
}
