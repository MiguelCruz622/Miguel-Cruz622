import javax.swing.JOptionPane;
public class CicloWhileIMC {
    public static void main( String [] args){
        float peso,estatura,imc;
        byte resp;
        do{
        peso=Float.parseFloat(JOptionPane. showInputDialog("Ingresa tu peso"));
        estatura=Float.parseFloat(JOptionPane. showInputDialog("Ingresa tu estatura en fomato de metros"));
        
        imc=(peso/(estatura*estatura)); 
        System.out.println("El indice de masa corporal " + imc);
        
        if(imc<18.49){
            System.out.println("Peso bajo");
        }else if (imc>=18.50 && imc<=24.99){
            System.out.println( "Peso normal"); 
        }else if ( imc>= 25 && imc<=29.99){
            System.out.println("Sobrepeso");
        }else if ( imc>= 30 && imc<=34.99){                
            System.out.println("Obesidad grado 1");
        }else if ( imc>= 35 && imc<=39.99){
            System.out.println("Obesidad grado 2");
        }else{
             System.out.println("Obesidad morbida");           
        }
        resp= Byte.parseByte( JOptionPane.showInputDialog("ESCRIBE 1 SI QUIRES QUE REALIZW UN" + "NUEVO CALCULO")); 
        }while(resp==1);                                   
    }   
}
