import java.util.Scanner;
public class Ejercicio66 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la figura: ");
        int height = sc.nextInt();

        if (height>=3 && height%2!=0) {
        for (int i = (height+1)/2; i>=1; i--) {
            for (int j = i; j<(height+1)/2; j++) {
                System.out.print(" ");
            }
            System.out.println("*    *");
        }
        for (int i = (height-1)/2; i>=1; i--) {
            for (int j = 1; j<i; j++) {
                System.out.print(" ");
            }
            System.out.println("*    *");
        }
    } else {
        System.out.print("Error: Introduzca una altura igual o mayor que 3 y que sea impar.");
    }
    }
    
}
