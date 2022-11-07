import java.util.Scanner;
public class Ejercicio53 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura: ");
        int altura = sc.nextInt();
        for (int cont1=altura; cont1>=1; cont1--) {
            for (int cont2=1; cont2<=cont1; cont2++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
    
}
