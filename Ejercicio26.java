import java.util.Scanner;
public class Ejercicio26 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el numero que quiere saber cuantas cifras tiene: ");
        int num = sc.nextInt();
        System.out.print("Introduzca el digito que quiere buscar: ");
        int num2 = sc.nextInt();
        int resto = 1;
        int cifras = 0;
        int comp = 0;
        do {
        resto = resto*10;
        cifras++;

        } while (num / resto !=0);
        resto = 1;
        for (int cont = 0; cont<=cifras; cont++) {
            comp = num / resto;
            comp = comp % 10;
            if (comp == num2) {
                System.out.printf("El numero se encuentra en  la posicion %s\n", cifras-(cont));
            }
            resto=resto*10;

        }
    }
}