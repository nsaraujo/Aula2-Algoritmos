/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algoritmo44;
import javax.swing.JOptionPane;

/**
 *
 * @author 55649
 */
public class Algoritmo44 {

    public static void main(String[] args) {
        //Algoritmo 44
        int num, base, logaritmo;
        String s;
        s = JOptionPane.showInputDialog("Entre com o logaritmando");
        System.out.println("Entre com o logaritmando: "+s);
        num = Integer.parseInt(s);
        
        s = JOptionPane.showInputDialog("Entre com a base");
        System.out.println("Entre com o base: "+s);
        base = Integer.parseInt(s);
        logaritmo = num / base;
        System.out.println("O logaritmo de num, na base informada é: "+logaritmo);
    }
}
