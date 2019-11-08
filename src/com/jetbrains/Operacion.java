package com.jetbrains;

import javax.swing.JOptionPane;

public class Operacion {

    int valor1;
    int valor2;

    public void veredicto(){
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Inserte un numero: "));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Inserte un numero: "));

        if (valor1 == valor2){
            System.out.println("Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.");
        }
        if (valor1 < valor2){
            System.out.println("Poco tiempo de estudio. Debes dedicar más tiempo.");
        }
        if (valor1 > valor2){
            System.out.println("Ideal. Trabajas los contenidos en casa.");
        }
    }

}