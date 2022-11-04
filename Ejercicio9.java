import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el numero que quiere saber cuantas cifras tiene: ");
        int num = sc.nextInt();
        int resto = 1;
        int cifras = 0;
        do {
        resto = resto*10;
        cifras++;

        } while (num / resto !=0);
        System.out.println("Tiene "+cifras+" cifras");
        sc.close();
        
    }
}