/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algoritmo42;
import javax.swing.JOptionPane;

/**
 *
 * @author 55649
 */
public class Algoritmo42 {

    public static void main(String[] args) {
        //Algoritmo 42 
        double angulo, rang;
        String s;
        s = JOptionPane.showInputDialog("Digite um angulo em graus: ");
        System.out.println("Digite um angulo em graus: "+s);
        angulo = Integer.parseInt(s);
        rang = (angulo * Math.PI) / 180;
        System.out.println("seno: "+Math.sin(rang));
        System.out.println("co-seno: "+Math.cos(rang));
        System.out.println("tangente: "+Math.tan(rang));
        System.out.println("co-secante: "+Math.sin(rang));
        System.out.println("secante: "+Math.cos(rang));
        System.out.println("cotangente: "+Math.tan(rang));
    }
}
