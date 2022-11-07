import java.util.Scanner;
public class Ejercicio43 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero: ");
        long num = sc.nextLong();
        System.out.print("Introduzca la posición en la que quiere partir el número: ");
        long pos = sc.nextLong();
        long volt = 0;
        long cifras = 0;
        long num2 = 0;
        System.out.print("Los numeros partidos son el ");
        while (num!=0) {
            volt *= 10;
            volt += num % 10;
            num /= 10;
            cifras++;
        }
        for (int cont1=0; cont1<pos-1; cont1++) {
            num2 = volt % 10;
            volt /= 10;
            System.out.print(num2);

        } System.out.print(" y el ");
        for (int cont2=0; cont2<=(cifras-pos); cont2++) {
            num2 = volt % 10;
            volt /= 10;
            System.out.print(num2);
        }
        sc.close();

    }
    
}
