import java.util.Scanner;
public class Ejercicio27 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca hasta que numero quiere ver los multiplos: ");
        int num = sc.nextInt();
        int suma = 0;
        int cont2 = 0;
        for (int cont1=1; cont1<=num; cont1++) {
            if (cont1 % 3 == 0) {
                System.out.print(cont1+" ");
                suma = suma+cont1;
                cont2++;
            }
        }
        System.out.printf("\nHay %s multiplos entre 1 y %s y la suma de estos es %s", cont2, num, suma);
    }
}
