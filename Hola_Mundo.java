/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp Intel
 */
//IMPORTMACION DE PAQUETES
import javax.swing.JOptionPane;

public class Hola_Mundo {
    public static void main (String []args){
        //Declaracion de variables
        byte b,h;
        float area;
        
        System.out.println("AREA DEL TRANGULO");
        b=Byte.parseByte(JOptionPane.showInputDialog("Ingresa base"));
        h=Byte.parseByte(JOptionPane.showInputDialog("Ingresa altura"));
        area=(b*h)/2;
        System.out.println("El area del triangulo es " + area);
    }
    
}

