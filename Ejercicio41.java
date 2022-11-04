import java.util.Scanner;
public class Ejercicio41  {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero entero positivo: ");
        long num1 = sc.nextLong();
        int resto = 1;
        int cifras = 0;
        long comp1 = 0;
        int par = 0;
        int impar = 0;
        do {
        resto = resto*10;
        cifras++;

        } while (num1 / resto !=0);
        resto = 1;
        for (int cont=0; cont<=cifras-2; cont++) {
            resto = resto*10;
        }
        for (int cont = 0; cont<=cifras; cont++) {
            comp1 = num1 / resto;
            comp1 = comp1 % 10;
            if (comp1 % 2==0) {
                par++;
            } else if (comp1 != 0) {
                impar++; }
        }
        System.out.print("El numero tiene "+par+" numeros pares")
        sc.close();
    }
}