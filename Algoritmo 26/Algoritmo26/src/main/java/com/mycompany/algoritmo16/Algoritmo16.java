/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algoritmo16;
import javax.swing.JOptionPane;

/**
 *
 * @author 55649
 */
public class Algoritmo16 {

    public static void main(String[] args) {
        // Algoritmo 26
        int data, dia, mes, ano, ndata;
        String s;
        s = JOptionPane.showInputDialog("Digite data no formato DDMMAA");
        data = Integer.parseInt (s);
        System.out.println("Digite data no formato DDMMAA:"+s);
        
        dia = data / 10000;
        mes = (data % 10000) / 100;
        ano = data % 100;
        ndata = (mes * 10000 + dia * 100 + ano);
        System.out.println("Dia: "+dia);
        System.out.println("Mes: "+mes);
        System.out.println("Ano: "+ano);
        System.out.println("DATA NO FORMATO MMDDAA: "+ndata);
    }
}
