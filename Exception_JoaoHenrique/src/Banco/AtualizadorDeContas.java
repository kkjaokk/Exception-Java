
package Banco;

public class AtualizadorDeContas {
    
    private double saldoTotal = 0;
    private double selic;
    
    
    AtualizadorDeContas(double selic){
        this.selic = selic;
    }
    
    void roda(Conta c){
        System.out.println("Saldo anterior: "+c.getSaldo());
        c.atualiza(0.15);
        System.out.println("Saldo Final: "+c.getSaldo());
        setSaldoTotal(saldoTotal+c.getSaldo());
        
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public double getSelic() {
        return selic;
    }

    public void setSelic(double selic) {
        this.selic = selic;
    }
    
    
    
}