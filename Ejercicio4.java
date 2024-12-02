/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp Intel
 */
import javax.swing.JOptionPane;
public class Ejercicio4 {
    public static void main(String []args){
        byte h, r;
        float vol,area;
        
        r=Byte.parseByte(JOptionPane.showInputDialog("Ingrese el radio"));
        h=Byte.parseByte(JOptionPane.showInputDialog("Ingrese la altura "));
        
        vol=(float) (Math.PI)*(r*r*h);
        area=(float) (2* Math.PI*r*h);
        
        System.out.println("El volumen es " + vol);
    }
}
