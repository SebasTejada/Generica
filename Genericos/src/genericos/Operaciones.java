
package genericos;


public class Operaciones <T>{
    public void sumar2Numeros(T n1, T n2){
        if(validar(n1)==true && validar(n2)==true){
            System.out.println("Números correctos");
            int numero1=(Integer.parseInt((String) n1));
            int numero2=(Integer.parseInt((String) n2));
             System.out.println("Números correctos = " + (numero1 + numero2));
        }else{
            System.out.println("No se puede realizar la operación");
        }
    }
        public void restar2Numeros(T n1, T n2){
        if(validar(n1)==true && validar(n2)==true){
            System.out.println("Números correctos");
            int numero1=(Integer.parseInt((String) n1));
            int numero2=(Integer.parseInt((String) n2));
             System.out.println("Números correctos = " + (numero1 - numero2));
        }else{
            System.out.println("No se puede realizar la operación");
        }
    }
    
         public void multiplicar2Numeros(T n1, T n2){
        if(validar(n1)==true && validar(n2)==true){
            System.out.println("Números correctos");
            int numero1=(Integer.parseInt((String) n1));
            int numero2=(Integer.parseInt((String) n2));
             System.out.println("Números correctos = " + (numero1 * numero2));
        }else{
            System.out.println("No se puede realizar la operación");
        }
    }
         
          public void dividir2Numeros(T n1, T n2){
        if(validar(n1)==true && validar(n2)==true){
            System.out.println("Números correctos");
            int numero1=(Integer.parseInt((String) n1));
            int numero2=(Integer.parseInt((String) n2));
             System.out.println("Números correctos = " + (numero1 / numero2));
        }else{
            System.out.println("No se puede realizar la operación");
        }
    }
public boolean validar (T n1){
    try{
        int res=(Integer.parseInt((String)n1));
        return true;
    }catch(Exception e){
        return false;
    }
  }
}
        
            
 
