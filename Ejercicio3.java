/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp Intel
 */
import javax.swing.JOptionPane;
public class Ejercicio3 {
    public static void main(String args[]){
        byte CatA, CatB;
        float Hip;
        CatA=Byte.parseByte(JOptionPane.showInputDialog("Ingrese el cateto a"));
        CatB=Byte.parseByte(JOptionPane.showInputDialog("Ingrese el cateto b"));
        Hip=(float) Math.sqrt(CatA+CatB);
        System.out.println("la hipotenusa es " + Hip);
    } 
}
