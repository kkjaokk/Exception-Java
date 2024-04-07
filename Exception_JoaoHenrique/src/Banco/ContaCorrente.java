package Banco;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ContaCorrente extends Conta implements Tributavel{

    @Override
    void atualiza(double taxa) {
        try {
            super.deposita(this.getSaldo() * (taxa * 2));
        } catch (ValorInvalidoException ex) {
            System.out.println(ex.getMessage());        }
    }
    
    @Override
     void deposita(double valor) throws ValorInvalidoException {
         super.deposita(valor-1);
    }

    @Override
    public double calculaTributos() {
        return this.getSaldo() * 0.01;
    }

}