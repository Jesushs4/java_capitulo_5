import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int contpos = 0;
        int contneg = 0;
        for (int cont=1; cont<=10; cont++) {
            System.out.print("Escriba un numero: ");
            int num = sc.nextInt();
            if (num>=0) {
                contpos++;
            } else if (num<0) {
                contneg++;
            }
        }
        System.out.printf("Se han introducido %d numeros positivos y %d numeros negativos",contpos,contneg);
    }
    
}
