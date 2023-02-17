//import java.util.Scanner;

package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;

public class Mavenproject1 {
    public static void main(String[] args) {
        int resultado,numero,numero2;
        String operador;
        try {
                numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
                numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
                operador = JOptionPane.showInputDialog("Ingrese un operador valido  (*) (/) (+) (-) ");
                
                //if(numero == Integer() && numero2 == Integer()){
                if("*".equals(operador)) {
                    resultado = numero * numero2;
                    JOptionPane.showMessageDialog(null,"El resultado de " + numero + " " + operador + "  " + numero2 + " es: "+ resultado);
                } else if ("/".equals(operador)) {
                    resultado = numero / numero2;
                    JOptionPane.showMessageDialog(null,"El resultado de " + numero + " " + operador + "  " + numero2 + " es: "+ resultado);
                }
                else if ("-".equals(operador)) {
                    resultado = numero - numero2;
                    JOptionPane.showMessageDialog(null,"El resultado de " + numero + " " + operador + "  " + numero2 + " es: "+ resultado);
                }
                else if ("+".equals(operador)) {
                    resultado = numero + numero2;
                    JOptionPane.showMessageDialog(null,"El resultado de " + numero + " " + operador + "  " + numero2 + " es: "+ resultado);
                }
                
                else{
                    JOptionPane.showMessageDialog(null,"Error Debe ingresar valores validos");
                }
            }
            
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Error Debe ingresar Numeros enteros");
        }
        //else{
        //    JOptionPane.showMessageDialog(null,"Debe ingresar Valores enteros");
        //}
  //}

}
}