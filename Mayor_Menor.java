/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp Intel
 */
import javax.swing.JOptionPane;
public class Mayor_Menor {
    public static void main(String args[]){
        byte a, b , c;
        a=Byte.parseByte(JOptionPane.showInputDialog("Introduzca un valor numerico"));
        b=Byte.parseByte(JOptionPane.showInputDialog("Introduzca otro valor numerico "));
        c=Byte.parseByte(JOptionPane.showInputDialog("Introduzca otro valor numerico diferente "));
        
        if (a==b && a==c){
            JOptionPane.showMessageDialog(null, "Los valores son iguales, Ingrese otros distintos");
        }else if(a>b && a>c){
            System.out.println( a + "  Es el mayor");
            if (b>c){
                System.out.println( b + "  Es el segundo valor mas grande");
                System.out.println( c + "  Es el mas pequeño");
            }else {
                 System.out.println( c + "  Es el segundo valor mas grande");
                 System.out.println( b + "  Es el mas pequeño");
            }     
        }else if(b>a && b>c){
            System.out.println( b + "  Es el mayor");
            if (a>c){
                System.out.println( a + "  Es el segundo valor mas grande");
                System.out.println( c + "  Es el mas pequeño");
            }else {
                 System.out.println( c + "  Es el segundo valor mas grande");
                 System.out.println( a + "  Es el mas pequeño");
            }     
        }else{
            System.out.println( c + "  Es el mayor");
            if (a>b){
                System.out.println( a + "  Es el segundo valor mas grande");
                System.out.println( b + "  Es el mas pequeño");
            }else {
                 System.out.println( b + "  Es el segundo valor mas grande");
                 System.out.println( c + "  Es el mas pequeño");
            }     
        }
    }
}
