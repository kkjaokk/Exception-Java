/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author João Henrique
 */
public class TesteDeposita {
    
    public static void main(String[] args) {
        
        Conta cp = new ContaPoupanca();
        try {
        cp.deposita(-100);
        } catch (ValorInvalidoException e) {
        System.out.println(e.getMessage());
        }
        
    }
    
}
