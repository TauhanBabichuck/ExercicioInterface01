/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio02;

/**
 *
 * @author Escola
 */
public class DesenvolvimentoJogo {
    public static void main(String[] args) {
        Ataque golpe01 = new Chute();
        Ataque golpe02 = new Especial();
        Ataque golpe04 = new Soco();
        
        
        golpe01.executar();
        golpe02.executar();
        golpe04.executar();
        
        
        
    }
    
    
}
