/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algoritmo43;
import javax.swing.JOptionPane;


/**
 *
 * @author 55649
 */
public class Algoritmo43 {

    public static void main(String[] args) {
        //Algoritmo 43
        int num, logaritmo;
        String s;
        s = JOptionPane.showInputDialog("Entre com o logaritmando: ");
        System.out.println("Entre com o logaritmando: "+s);
        num = Integer.parseInt(s);
        logaritmo = num / 10;
        System.out.println("Logaritmo: "+logaritmo);
    }
}
