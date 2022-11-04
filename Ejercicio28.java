import java.util.Scanner;
public class Ejercicio28 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int factorial = 1;
        System.out.print("Introduzca un numero entero: ");
        int num = sc.nextInt();
        for (int cont1 = 1; cont1<=num; cont1++) {
        factorial = factorial*(cont1);
        }
        System.out.printf("6! = %s", factorial);
    }
}
