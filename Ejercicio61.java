import java.util.Scanner;
public class Ejercicio61 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la V: ");
        int height = sc.nextInt();

        if (height>=3) {
        for (int i = (height)-1; i>0; i--) {
            for (int j = height-1 ; j>i; j--) {
                System.out.print(" ");
            }
            System.out.print("***");
            for (int j = 0; j<i*2; j++) {
                System.out.print(" ");
            }
            System.out.println("***");
        }
        for (int i = 0; i<height-1; i++) {
            System.out.print(" ");
        }
        System.out.print("******");
        }
        else if (height<3) {
            System.out.print("Error: Introduzca una altura mayor o igual que 3");
        }
    }
    
}
