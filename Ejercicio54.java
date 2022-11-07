import java.util.Scanner;
public class Ejercicio54 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura: ");
        int altura = sc.nextInt();
        for (int cont1=altura; cont1>=1; cont1--) {
            System.out.print("*");
        } System.out.println();
        for (int cont1=altura-1; cont1>=2; cont1--) {
            System.out.print("*");
            for (int cont2=1; cont2<=cont1-2; cont2++) {
                System.out.print(" ");

            } System.out.print("*");
            System.out.println();
        }
        System.out.print("*");
    }
    
}
