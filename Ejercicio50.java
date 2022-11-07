import java.util.Scanner;
public class Ejercicio50 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura (mínimo 5): ");
        int height = sc.nextInt();
        System.out.print("Introduzca los espacios (mínimo 1): ");
        int space = sc.nextInt();


        if (height>=5 && space>=1) {
        System.out.print("*");
        for (int i = 0; i<space; i++) {
            System.out.print(" ");
        }
        System.out.print("****");
        for (int i = 0; i<space; i++) {
            System.out.print(" ");
        }
        System.out.println("****");

        System.out.print("*");
        for (int i = 0; i<space; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        for (int i = 0; i<space+3; i++) {
            System.out.print(" ");
        }
        System.out.println("*");

        System.out.print("*");
        for (int i = 0; i<space; i++) {
            System.out.print(" ");
        }
        System.out.print("****");
        for (int i = 0; i<space; i++) {
            System.out.print(" ");
        }
        System.out.println("****");

        for (int j = 0; j<height-4; j++) {
            System.out.print("*");
            for (int i = 0; i<space+3; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int i = 0; i<space+3; i++) {
                System.out.print(" ");
            }
            System.out.println("*");

        }

        System.out.print("*");
        for (int i = 0; i<space; i++) {
            System.out.print(" ");
        }
        System.out.print("****");
        for (int i = 0; i<space; i++) {
            System.out.print(" ");
        }
        System.out.println("****");
        } else {
            System.out.print("Error: Introduzca una altura mayor o igual que 5 y un espacio mayor o igual que 1");
        }
    }
}
