import java.util.Scanner;
public class Ejercicio67 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el numero de escalones: ");
        int stairnum = sc.nextInt();
        System.out.print("Introduzca la altura de cada escalón: ");
        int stairheight = sc.nextInt();
        for (int i = 1; i<=stairnum; i++) {
            for (int j = 1; j<=stairheight; j++) {
                for (int k = 1; k<=4*i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
    
}
