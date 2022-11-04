import java.util.Scanner;
public class Ejercicio39 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero entero positivo: ");
        int num1 = sc.nextInt();
        int suma = 1;
        for (int cont1=1; cont1<=num1; cont1++) {
            for (int cont2=2; cont2<=cont1; cont2++) {
                suma*=cont2;
            }
            System.out.println(cont1+"! = "+suma);
            suma=1;
        }
    }
}
