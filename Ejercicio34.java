import java.util.Scanner;
public class Ejercicio34  {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero entero positivo: ");
        long num1 = sc.nextLong();
        System.out.print("Introducza otro numero: ");
        long num2 = sc.nextLong();
        int resto = 1;
        int cifras = 0;
        long comp1 = 0;
        long comp2 = 0;
        do {
        resto = resto*10;
        cifras++;

        } while (num1 / resto !=0);
        resto = 1;
        for (int cont=0; cont<=cifras-2; cont++) {
            resto = resto*10;
        }
        System.out.print("Digitos pares: ");
        for (int cont = 0; cont<=cifras; cont++) {
            comp1 = num1 / resto;
            comp1 = comp1 % 10;
            if (comp1 % 2==0) {
                System.out.print(comp1);
            } else if (comp1 == 0) {
                System.out.print("0"); }
            comp2 = num2 / resto;
            comp2 = comp2 % 10;
            if (comp2 % 2==0) {
                System.out.print(comp2);
            } else if (comp2 == 0) {
                System.out.print("0"); }
            resto=resto/10;
            if (resto==0) {
                cont=cifras;
            } }
            resto = 1;
        for (int cont1=0; cont1<=cifras-2; cont1++) {
            resto = resto*10;
        } 
        System.out.println();
        System.out.print("Digitos impares: ");
        for (int cont2 = 0; cont2<=cifras; cont2++) {
            comp1 = num1 / resto;
            comp1 = comp1 % 10;
            if (comp1 % 2!=0) {
                System.out.print(comp1); }
            comp2 = num2 / resto;
            comp2 = comp2 % 10;
            if (comp2 % 2!=0) {
                System.out.print(comp2);
            }
            resto=resto/10;
            if (resto==0) {
                cont2=cifras;
            }

        }
        sc.close();
    }
}
