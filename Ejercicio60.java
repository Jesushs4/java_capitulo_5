import java.util.Scanner;
public class Ejercicio60 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de los calcetines: ");
        int altura = sc.nextInt();

        if (altura>=4) {
        for (int cont1=1; cont1<=altura-2; cont1++) {
            System.out.println("***     ***");
        }
        for (int cont2=1; cont2<=2; cont2++) {
            System.out.println("******  ******");
        }
        }
        else if (altura<4) {
            System.out.print("Error: Introduzca una altura mayor o igual que 4");
        }
    }
    
}
