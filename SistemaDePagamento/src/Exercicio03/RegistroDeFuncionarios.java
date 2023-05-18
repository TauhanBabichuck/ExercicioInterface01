/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio03;

/**
 *
 * @author Escola
 */
public class RegistroDeFuncionarios {
    
    public static void main(String[] args) {
        
        CalculoSalario funcionario01 = new Desenvolvedor();
        CalculoSalario funcionario02 = new Analista();
        CalculoSalario funcionario03 = new Gerente();
        
        funcionario01.calcularSalario();
        funcionario02.calcularSalario();
        funcionario03.calcularSalario();
        
        
        
    }
    
}
