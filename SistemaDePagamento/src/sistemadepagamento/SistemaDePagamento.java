
package sistemadepagamento;


public class SistemaDePagamento {

   
    public static void main(String[] args) {
        
        Pagamento ele = new TransferenciaBancaria();
        ele.realizar(58);
        
        Pagamento eles = new Pix();
        eles.realizar(454);
        
        Pagamento nos = new CartaoDeCredito();
        nos.realizar(246);
    }
    
}
