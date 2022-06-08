import genericos.Operaciones;
import java.util.Scanner;


public class Genericos {
    
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    
    String num1="" ,num2="" ;
    
        System.out.println("Ingrese el número 1");
        num1= teclado.nextLine();
        System.out.println("Ingrese el número 2");
        num2= teclado.nextLine();
        
        Operaciones<String> op= new Operaciones<String>();
        op.sumar2Numeros(num1,num2);
    
        //Operaciones<String> op= new Operaciones<String>();
        //op.restar2Numeros(num1,num2);
        
        //Operaciones<String> op= new Operaciones<String>();
        //op.multiplicar2Numeros(num1,num2);
      
        //Operaciones<String> op= new Operaciones<String>();
        //op.dividir2Numeros(num1,num2);
      
      
        
    }
    
}
