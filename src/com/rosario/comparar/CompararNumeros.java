package com.rosario.comparar;

import javax.swing.*;

public class CompararNumeros {

    public static void main (String args[]){

        //ENTRADA

        int pequenio=0,mediano=0,grande=0;
        int primero,segundo,tercero;
        String salida;

        primero = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Proporcione un numero","Primero valor ",JOptionPane.INFORMATION_MESSAGE));
        segundo = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Proporcione un valor ","Segundo valor ", JOptionPane.INFORMATION_MESSAGE));
        tercero = Integer.parseInt(JOptionPane.showInputDialog(null,
               "Proporcione un valor ", "Tercer valor ", JOptionPane.INFORMATION_MESSAGE ));


        //PROCESO

        if (primero>segundo && primero>tercero) {
            grande = primero;
            if( segundo>tercero) {
                mediano = segundo;
                pequenio = tercero;
            } else{
                mediano=tercero;
                pequenio=segundo;
            }

        } else if (segundo>primero && segundo>tercero) {
            grande = segundo;
            if (primero > tercero) {
                mediano = primero;
                pequenio = tercero;
            } else {
                mediano = tercero;
                pequenio = primero;

            }
        }else if (tercero>primero && tercero>segundo){
            grande=tercero;
            if(primero>segundo){
                mediano=primero;
                pequenio=segundo;
            }else{
                mediano=segundo;
                pequenio=primero;
            }
        }

        //SALIDA

        salida = "El numero grandes es: " + grande +
                "\nEl numero mediano es: " + mediano +
                "\nEl numero pequenio es: " + pequenio;

                JOptionPane.showMessageDialog(null,salida,"RESULTADO fINAL ",JOptionPane.INFORMATION_MESSAGE);
    }
}