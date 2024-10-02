import java.util.Scanner;
public class ejercicio_3 {
    public static void main(String[] args){
      Scanner entrada = new Scanner(System.in);
      int a, b;
      System.out.print("Introduce un número: ");
      a = entrada.nextInt();
      System.out.print("Introduce otro número: ");
      b = entrada.nextInt();
      
      int c = (a + b);
      byte cbyte = (byte) c;
      System.out.println("La suma de los 2 números es: "+c);

      entrada.close();
    }

}
