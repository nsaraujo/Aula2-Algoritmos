/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algoritmo23;
import javax.swing.JOptionPane;

/**
 *
 * @author 55649
 */
public class Algoritmo23 {

    public static void main(String[] args) {
        //Algoritmo 23
        int a, d;
        String s;
        s = JOptionPane.showInputDialog("Digite o número de tres casas:");
        a = Integer.parseInt(s);
        System.out.println("Digite o número de tres casas:"+s);
        
        d = (a % 100) / 10;
        
        System.out.println("algarismo da casa das dezenas: "+d);
    }
}
