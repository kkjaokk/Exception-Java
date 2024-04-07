package Banco;

public class Teste {

    public static void main(String[] args) throws ValorInvalidoException {
        ContaCorrente cc2 = new ContaCorrente();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        
        
        cc2.deposita(2000);
        cc.deposita(1000);
        cp.deposita(1000);
        
        AtualizadorDeContas att = new AtualizadorDeContas(0.15);
        
        att.roda(cc2);
        att.roda(cc);
        att.roda(cp);
        
        /*System.out.printf("Conta: %.2f\n",c.getSaldo());
        System.out.printf("Corrente: %.2f\n",cc.getSaldo());
        System.out.printf("Poupança: %.2f\n",cp.getSaldo());*/
        
        System.out.printf("O saldo total e: %.2f",att.getSaldoTotal());

    }

}