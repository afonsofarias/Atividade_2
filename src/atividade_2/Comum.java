/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_2;

/**
 *
 * @author afons
 */
public class Comum extends Funcionario{
    public Comum (String nome, double salario, String cargo){
        super(nome, salario, cargo);
    }
    
    @Override
    public void bonificacao (){
        this.salario += (this.salario * 0.05);
        System.out.println("O salario de " + this.cargo + " + o Bonus é: " + this.salario);
        
    }
}
