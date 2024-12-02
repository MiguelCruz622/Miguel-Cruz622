/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp Intel
 */
import javax.swing.JOptionPane;
public class Numero_Mayor {
    public static void main (String [] args){
        byte a, b;
        a=Byte.parseByte(JOptionPane.showInputDialog("Introduzca un valor numerico"));
        b=Byte.parseByte(JOptionPane.showInputDialog("Introduzca otro valor numerico"));
        
        if(a==b){
            System.out.println("Ambos numeros son iguales");
        }else if(a>b){
            System.out.println(a + "es el mayor");
        }else{
            System.out.println(b + " es el mayor");
        }
    }
}


