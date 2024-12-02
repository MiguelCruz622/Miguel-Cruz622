public class TablasDeMultiplicar {
    public static void main(String args []){
        byte r, a, b;
        for(a=1; a<=10; a++){
            for(b=1; b<=10; b++){
                r=(byte) (a*b);
                System.out.println(a + "*" + b + "=" + r);
            }
        }
    }
}
