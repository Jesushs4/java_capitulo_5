import java.util.Scanner;
public class Ejercicio32  {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero entero positivo: ");
        long num = sc.nextLong();
        int resto = 1;
        int cifras = 0;
        long comp = 0;
        long suma = 0;
        do {
        resto = resto*10;
        cifras++;

        } while (num / resto !=0);
        resto = 1;
        for (int cont=0; cont<=cifras-2; cont++) {
            resto = resto*10;
        }
        System.out.print("Digitos pares: ");
        for (int cont = 0; cont<=cifras; cont++) {
            comp = num / resto;
            comp = comp % 10;
            if (comp % 2==0) {
                System.out.print(comp+" ");
                suma=suma+comp;
            }
            resto=resto/10;
            if (resto==0) {
                cont=cifras;
            }

        }
        
        sc.close();
    }
}