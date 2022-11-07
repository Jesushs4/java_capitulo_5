import java.util.Scanner;
public class Ejercicio65 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una altura (un número mayor o igual a 3): ");
        int height = sc.nextInt();
        if (height<3) {
            System.out.print("La altura introducida no es correcta");
        } else {
        System.out.print("Introduzca la fila del palito horizontal (entre 2 y "+(height-1)+"): ");
        int row = sc.nextInt();
        int count = 2;

        if (row<2 || row>height-1) {
            System.out.print("La fila introducida no es correcta");
        }
        else {
        for (int i = 0; i<height-1; i++) {
            System.out.print(" ");
        } System.out.println("*");
        for (int i = height-2; i>0; i--) {
            for (int j = i; j>0; j--) {
                System.out.print(" ");
            }
            if (row==count) {
                for (int k = i*2; k<(height*2)-1; k++) {
                    System.out.print("*");
                }

            } else {
            System.out.print("*");
            for (int k = i*2; k<(height*2)-3; k++) {
                System.out.print(" ");
            } System.out.print("*");
            }
            System.out.println();
            count++;
        }
        System.out.print("*");
        for (int i = 1; i<(height*2)-2; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        }
    }
    }
}
