public class Ejercicio2 {
    public static void main(String args []){
        int p,c,g,s;
        
        p=((20*2000000)/100);
        System.out.println("Pediatria  le toca el 20 %, la cantidad que le toca es $" + p);
        c=((15*2000000)/100);
        System.out.println("Pediatria  le toca el 15 %, la cantidad que le toca es $" + c);
        g=((40*2000000)/100);
        System.out.println("Pediatria  le toca el 40 %, la cantidad que le toca es $" + g);
        s=((10*2000000)/100);
        System.out.println("Pediatria  le toca el 10 %, la cantidad que le toca es $" + s);
        System.out.println("sg=p+c+g+s; p=2000000-sg  s=p*100/2000000");
    }
}
