import java.util.Scanner;
public class Ejercicio69 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la pirámide maya: ");
        int height = sc.nextInt();

        if (height>=3) {
        for (int i = 1; i<=(height*2-1); i+=2) {
            for (int k = (height*2)-2; k>=i; k-=2) {
                System.out.print(" ");
            }
            if (((i+1)/2)%2!=0) {
                System.out.print("******");
            for (int j = 1; j<i; j++) {
                System.out.print("*");
            }
        } else if (((i+1)/2)%2==0) {
            System.out.print("*");
            for (int j = 1; j<i; j+=2) {
                System.out.print("*");
            }
            
        System.out.print("    ");
            
            System.out.print("*");
            for (int j = 1; j<i; j+=2) {
                System.out.print("*");
            }
        } System.out.println();
     }
    } else {
        System.out.print("Error: Introduce una altura igual o mayor que 3");
    }


        }
    }
    
