/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algoritmo41;
import javax.swing.JOptionPane;

/**
 *
 * @author 55649
 */
public class Algoritmo41 {

    public static void main(String[] args) {
        //Algoritmo 41
        int a, b, c, d, mp;
        String s;
        s = JOptionPane.showInputDialog("Entre com 1 número");
        System.out.println("Entre com 1 número");
        a = Integer.parseInt(s);
        
        s = JOptionPane.showInputDialog("Entre com 2 número");
        System.out.println("Entre com o 2 número");
        b = Integer.parseInt(s);
                
        s = JOptionPane.showInputDialog("Entre com 3 número");
        System.out.println("Entre com 3 número");
        c = Integer.parseInt(s);
        
        
        s = JOptionPane.showInputDialog("Entre com 4 número");
        System.out.println("Entre com 4 número");
        d = Integer.parseInt(s);
        
        mp = (a*1 + b*2 + c*3 + d*4) / 10;
        
        System.out.println("Média ponderada: "+mp);
    }
}
