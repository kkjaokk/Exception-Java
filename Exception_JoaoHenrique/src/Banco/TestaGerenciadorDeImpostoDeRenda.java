/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author João Henrique
 */
public class TestaGerenciadorDeImpostoDeRenda {
    
    public static void main(String[] args) throws ValorInvalidoException {
        
        GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
        SeguroDeVida sv = new SeguroDeVida();
        gerenciador.adiciona(sv);
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(1000);
        gerenciador.adiciona(cc);
        System.out.println(gerenciador.getTotal());
        System.out.printf("O saldo e: %.2f", + cc.getSaldo());
             
    }
    
}
