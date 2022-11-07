import java.util.Scanner;
public class Ejercicio64 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        int height = 3;
        int width = 6;
        int tempheight = 0;
        int tempwidth = 0;
        while (exit == false) {
            for (int i = 1; i<=width; i++) {
                System.out.print("*");
            } System.out.println();
            for (int i = 1; i<=height-2; i++) {
                System.out.print("*");
                for (int j = 1; j<=width-2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            for (int i = 1; i<=width; i++) {
                System.out.print("*");
            } System.out.println();

            System.out.println("Elija la opción:");
            System.out.println("1. Agrandar");
            System.out.println("2. Achicar");
            System.out.println("3. Cambiar la orientación");
            System.out.println("4. Salir");
            int option = sc.nextInt();
        switch(option) {
            case 1:
            width+=2;
            height++;
            break;
            case 2:
            if (height>=3 && width>=4) {
            width-=2;
            height--;
            } else {
                System.out.println("No se puede achicar más");
            }
            break;
            case 3:
            tempwidth = width;
            tempheight = height;
            height = tempwidth;
            width = tempheight;
            break;
            case 4:
            exit = true;
            break;
            default:
                System.out.println("Introduzca una opción válida");
        }
        }

    }
    
}
