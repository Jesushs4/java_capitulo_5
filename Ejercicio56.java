import java.util.Scanner;
public class Ejercicio56 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura: ");
        int altura = sc.nextInt();
        for (int cont1=altura; cont1>=1; cont1--) {
            for (int cont3=cont1; cont3<altura; cont3++) {
                System.out.print(" ");
            }
            for (int cont2=1; cont2<=cont1; cont2++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
    
}
