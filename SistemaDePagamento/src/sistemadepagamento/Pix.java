/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadepagamento;

/**
 *
 * @author Escola
 */
public class Pix implements Pagamento{

    @Override
    public void realizar(double valor) {
        System.out.println("Pago com PIX - " + valor);
    }
    
}
