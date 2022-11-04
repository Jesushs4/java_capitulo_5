import java.util.Scanner;
public class Ejercicio29 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca hasta que numero quiere leer: ");
        int num1 = sc.nextInt();
        System.out.print("Introduzca el numero por el que quiere dividir: ");
        int div = sc.nextInt();
        
        for (int cont1=1; cont1<=num1; cont1++) {
            if (cont1 % div != 0) {
                System.out.print(cont1+" ");
            }
        }

    }
}
