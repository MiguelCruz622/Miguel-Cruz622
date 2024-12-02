import javax.swing.JOptionPane;
public class Factorial {
    public static void main(String args []){
        byte x, num;
        int fact = 1;
        num=Byte.parseByte(JOptionPane.showInputDialog("Captura un numero"));
        for(x=num; x>=1; x--){
            fact*=x;
            System.out.println(fact );
            
            
        }
    }
}
