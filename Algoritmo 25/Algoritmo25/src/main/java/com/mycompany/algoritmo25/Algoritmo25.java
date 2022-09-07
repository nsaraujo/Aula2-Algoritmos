/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algoritmo25;
import javax.swing.JOptionPane;
/**
 *
 * @author 55649
 */
public class Algoritmo25 {

    public static void main(String[] args) {
        // Algoritmo 25
        int data, dia, mes, ano;
        String s;
        s = JOptionPane.showInputDialog("Digite data no formato DDMMAA: ");
        data = Integer.parseInt(s);
        System.out.println("Digite data no formato DDMMAA:"+s);
        
        dia = data / 10000;
        mes = (data % 10000) / 100;
        ano = data % 100;
        System.out.println("Dia: "+dia);
        System.out.println("Mês: "+mes);
        System.out.println("Ano: "+ano);

    }
}
