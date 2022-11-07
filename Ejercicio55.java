import java.util.Scanner;
public class Ejercicio55 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int num = sc.nextInt();
        int resto = num % 10;
        num /= 10;
        if (resto>0) {
        System.out.print(resto); }
        if (num>0) {
        System.out.print(num); }
    }
    
}
