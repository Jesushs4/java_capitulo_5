import java.util.Scanner;
public class Ejercicio52 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero (mayor que cero): ");
        int num = sc.nextInt();
        int numcomp = num;
        int resto = 0;
        int numvolt = 0;
        int numgiro = 0;
        while (num > 0) {
            numvolt *= 10;
            numvolt += num % 10;
            num /= 10;
        }
        resto = numvolt % 10;
        numvolt /= 10;
        while (numvolt > 0) {
            numgiro *= 10;
            numgiro += numvolt % 10;
            numvolt /= 10;
        }
        if (numcomp>10) {
        System.out.print(numgiro);
        System.out.print(resto); }
        else {
            System.out.print(numcomp);
        }
    }
    
}
