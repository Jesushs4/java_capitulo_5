import java.util.Scanner;
public class Ejercicio68 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        long num = sc.nextLong();
        long aux = num;
        long numturn = 0;
        long digit = 0;
        long numdisloc = 0;
        while (num > 0) {
            numturn = (numturn*10) + (num%10);
            num/=10;
        }
        while (numturn > 0) {
            digit = numturn % 10;
            if (digit % 2==0) {
                digit++;
            } else if (digit % 2!=0) {
                digit--;
            }
            numdisloc = (numdisloc*10) + (digit);
            numturn/=10;

        }
        System.out.printf("Dislocando el número %d sale el %d",aux,numdisloc);

    }
}
