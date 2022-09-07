/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algoritmo46;
import javax.swing.JOptionPane;

/**
 *
 * @author 55649
 */
public class Algoritmo46 {

    public static void main(String[] args) {
        //Algoritmo 46 
        
        double saldo, nsaldo;
        String s; 
        s = JOptionPane.showInputDialog("Entre com o saldo");
        System.out.println("Saldo anterior: "+s);
        saldo = Float.parseFloat(s);
        
        
 
        nsaldo = (saldo * 1.01);
        
        System.out.println("O novo saldo é: "+nsaldo);
    }
}
