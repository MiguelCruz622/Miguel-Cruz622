/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp Intel
 */
import javax.swing.JOptionPane;
public class Ejercicio5 {
    public static void main(String args[]){
        byte n, r;
        n=Byte.parseByte(JOptionPane.showInputDialog("Ingrese un numero cualquiera"));
        r=(byte) (n%2);
        if(r==0){
            System.out.println("El numero " + n + " es par");
        }else{
            System.out.println("El numero " + n + " es impar");
        }
    }
}
