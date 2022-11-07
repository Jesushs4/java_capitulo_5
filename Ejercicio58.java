import java.util.Scanner;
public class Ejercicio58 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int num = sc.nextInt();
        int suma = 0;
        int cifras = 0;
        while (num>0) {
            suma += num % 10;
            num /= 10;
            cifras++;
        }
        System.out.print("La media de sus digitos es "+(float)suma/cifras);
    }
    
}
