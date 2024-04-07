package Banco;

public class Conta {

    private int numero;
    Cliente titular = new Cliente();
    private double saldo;
    private double limite;
    private static int totalDeContas;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static int getTotalDeContas() {
        return totalDeContas;
    }

    Conta() {
        System.out.println("Construindo uma conta");
        totalDeContas = totalDeContas + 1;
    }

    Conta(double saldo) {
        this(); // chama o primeiro construtor
        this.saldo = saldo;
    }

    Conta(double saldo, int numero, double limite) {
        this(saldo); // chama o segundo construtor
        //this.saldo = saldo;
        this.numero = numero;
        this.limite = limite;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo + limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    boolean saca(double valor) {
        if (this.saldo < valor) {
            System.out.println("Saldo Insuficiente");
            return false;
        } else {
            this.saldo = this.saldo - valor;
            System.out.println("Saque realizado");
            return true;
        }
    }

    void atualiza(double taxa){
        
            this.saldo += this.saldo * taxa;
            
    }
    //this.saldo += this.saldo * taxa; // equivalente

    void deposita(double valor) throws ValorInvalidoException {
       if (valor < 0) {
            throw new ValorInvalidoException(valor);
            } else {
            this.saldo += valor - 0.10;
            }
    }

    void transfere(Conta c1, double valor) throws ValorInvalidoException {
        if (this.saca(valor) == true) {
            c1.deposita(valor);
        } else {
            System.out.println("Transferência não realizada");
        }

    }

}