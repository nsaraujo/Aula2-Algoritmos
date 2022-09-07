/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algoritmo48;

import javax.swing.JOptionPane;

/**
 *
 * @author 55649
 */
public class Algoritmo48 {

    public static void main(String[] args) {
        //Algoritmo 48
        
        double sm, qtdade, preco, vp, vd;
        String s;
        s = JOptionPane.showInputDialog("Digite o salário mínimo: ");   
        System.out.println("O salário mínimo é: "+s);
        sm = Integer.parseInt(s);
        
        s = JOptionPane.showInputDialog("Entre com a quantidade de quilowatt: "+s);
        System.out.println("Quantidade de quilowatt: "+s);
        qtdade = Integer.parseInt(s);
        
        
        preco = (sm / 700);
        vp = (preco * qtdade);
        vd = (vp * 0.9);
        System.out.format("Preço do quilowatt %.2f \n valor a ser pago: %2f" , preco, vp);
    }
}
