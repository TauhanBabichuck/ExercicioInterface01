/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio01;

/**
 *
 * @author Escola
 */
public class CartaoDeCredito implements Pagamento{

    @Override
    public void realizar(double valor) {
        System.out.println("Pago com cartão de crédito - " + valor);
    }
    
}
