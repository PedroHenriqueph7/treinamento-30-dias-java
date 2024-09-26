package semana3.testes_codigo3.funcionalidades;

import semana3.testes_codigo3.objetos.Pessoa;

public class IgualdadeObjeto {
    public boolean verificarAIgualdadeObjeto(Pessoa pessoa1, Pessoa pessoa2){
        if (pessoa1.equals(pessoa2)) {
           return true;
        }else{
           return false;
        }
        }
}
