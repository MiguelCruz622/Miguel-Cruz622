import javax.swing.JOptionPane;
public class CicloDoWhile {
    public static void main(String args []){
        byte alumno=1;
        float cu1, cu2, cu3, cu4, cu5, prom;
        do{
            cu1=Float.parseFloat(JOptionPane.showInputDialog("Dime la calificacion 1 del alumno " + alumno));
            cu2=Float.parseFloat(JOptionPane.showInputDialog("Dime la calificacion 2 del alumno " + alumno));
            cu3=Float.parseFloat(JOptionPane.showInputDialog("Dime la calificacion 3 del alumno " + alumno));
            cu4=Float.parseFloat(JOptionPane.showInputDialog("Dime la calificacion 4 del alumno " + alumno));
            cu5=Float.parseFloat(JOptionPane.showInputDialog("Dime la calificacion 5 del alumno " + alumno));
            prom=(cu1+cu2+cu3+cu4+cu5)/5;
            System.out.println("alumno " + alumno + " Tu promedio es " + prom);
            alumno++; 
        }while(alumno<=34);
    }
}
