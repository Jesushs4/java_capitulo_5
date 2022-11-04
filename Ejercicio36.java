import java.util.Scanner;
public class Ejercicio36 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        long num1 = sc.nextLong();
        long num2 = num1;
        long comp = 0;
        while (num1 > 0) {
            comp= (comp*10) + num1%10;
            num1/=10;
        }
        if (num2==comp) {
            System.out.print("Es capicua");
        } else {
            System.out.print("No es capicua"); }


    }
    
}
