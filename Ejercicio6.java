/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp Intel
 */
import javax.swing.JOptionPane;
public class Ejercicio6 {
    public static void main(String args[]){
        char NuevaNota = 0;
        byte Nota;
        Nota=Byte.parseByte(JOptionPane.showInputDialog("Ingrese su nota"));
        
        if(Nota>=19 && Nota<=20){
            NuevaNota='A';
        }else if(Nota>=16 && Nota<=18){
            NuevaNota='B';
        }else if(Nota>=13 && Nota<=15){
            NuevaNota='C';
        }else if(Nota>=10 && Nota<=12){
            NuevaNota='D';
        }else if(Nota>=1 && Nota<=9){
            NuevaNota='E';
        }
        
        System.out.println("Su nota es de " + Nota);
        System.out.println("Su Nueva nota es " + NuevaNota);
    }
}
