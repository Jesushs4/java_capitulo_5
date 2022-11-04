import java.util.Scanner;
public class Ejercicio23 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int suma = 0;
        int cont1 = 0;
        while (suma<=10000)  {
            System.out.print("Introduzca un numero que sumar: ");
            num = sc.nextInt();
            suma = suma+num;
            cont1++;

        } System.out.printf("El valor es de %s, se han introducido %s numeros y la media es de %s",suma,cont1,(double)suma/cont1);
    }
}
