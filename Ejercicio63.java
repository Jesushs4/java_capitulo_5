import java.util.Scanner;
public class Ejercicio63 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la primera pirámide: ");
        int height1 = sc.nextInt();
        for (int i=1; i<height1*2; i+=2) {
            for (int j = (height1-1); j>i/2; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println();


        }
    }
}
