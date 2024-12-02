import javax.swing.JOptionPane;
public class Ejercico1 {
    public static void main(String args[]){
        String a;
        float p, d;
        long costo;
        a=JOptionPane.showInputDialog("Ingrese el animal que viene a esterilizar perro, gato, conejo o cuyo");
        switch(a){
            case "perro" -> { 
                costo = 500;
                p=((20*costo)/100);
                d = costo-p;
                System.out.println(a);
                System.out.println("El costo sin desdcuento es de $" + costo);
                System.out.println("El descuento de 20% es de $" + p);
                System.out.println("El Total a pagar con el decuento es de $" + d);
            }
            case "gato" -> {
                costo=520;
                p=((10*costo)/100);
                d = costo-p;
                System.out.println(a);
                System.out.println("El costo sin desdcuento es de $" + costo);
                System.out.println("El descuento de 10% es de $" + p);
                System.out.println("El Total a pagar con el decuento es de $" + d);
            }
            case "conejo" -> {
                costo=350;
                p=((50*costo)/100);
                d = costo-p;
                System.out.println(a);
                System.out.println("El costo sin desdcuento es de $" + costo);
                System.out.println("El descuento de 50% es de $" + p);
                System.out.println("El Total a pagar con el decuento es de $" + d);
            }
            case "cuyo" -> {
                costo=400;
                p=((80*costo)/100);
                d = costo-p;
                System.out.println(a);
                System.out.println("El costo sin desdcuento es de $" + costo);
                System.out.println("El descuento de 80% es de " + p);
                System.out.println("El Total a pagar con el decuento es de $" + d);
            }
            default -> System.out.println("Por el momento solo tenemos estos animales. perro, gato, conejo o cuyo");
        }
    }
}