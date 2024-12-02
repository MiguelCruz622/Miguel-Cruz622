import javax.swing.JOptionPane;
public class CicloDoWhileFactorial {
    public static void main(String args []){
        byte x, num, resp=1;
        int fact;
        do{
            fact=1;
            num=Byte.parseByte(JOptionPane.showInputDialog("Captura un numero"));
            
            for(x=num; x>=1;x--){
                fact*=x;
            }
            System.out.println("El factorial de " + num + "es:" + fact);
            resp=Byte.parseByte(JOptionPane.showInputDialog("Presiona 1 para realizar otro calculo"));
        }while(resp==1);
    }
}
