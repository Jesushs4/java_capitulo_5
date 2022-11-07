import java.util.Scanner;
public class Ejercicio59 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura del arbol: ");
        int height = sc.nextInt();

        if (height>=4) {

        for (int i = 0; i<height-3; i++) {
            System.out.print(" ");
        } System.out.println("*");

        for (int i = 0; i<height-3; i++) {
            System.out.print(" ");
        } System.out.println("^");
        for (int i = height-4; i>0; i--) {
            for (int j = i; j>0; j--) {
                System.out.print(" ");
            } System.out.print("^");
            for (int k = i*2; k<(height*2)-7; k++) {
                System.out.print(" ");
            } System.out.print("^");
            System.out.println();
        }
        for (int i = 0; i<(height*2)-5; i++) {
            System.out.print("^");
        } System.out.println();

        for (int i = 0; i<height-3; i++) {
            System.out.print(" ");
        } System.out.println("Y");
        } else {
            System.out.print("Error: Introduzca una altura igual o mayor que 4.");
        }
    }
}
