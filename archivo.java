import java.util.Scanner; 
public class StringsEjercicio1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        String texto; 
        System.out.println("Introduce palabra");
        texto = sc.nextLine(); 
        System.out.println("La longitud de "+ texto + "es" + texto.length());
        if (texto.length() >= 7){
            System.out.println("El texto.length" + texto.charAt (7));
        }else{
            System.out.println("No existe el caracter en la posicion 7");   
        }
            System.out.println("En mayusculas" + texto.toUpperCase()); 
            texto = texto.toUpperCase(); 
        }
       if (texto.indexOf("x") >= 0){ texto= ("Hola)"); 



       }

      

    }
}
