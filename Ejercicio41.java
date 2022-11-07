import java.util.Scanner;
public class Ejercicio41  {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero entero positivo: ");
        long num1 = sc.nextLong();
        long comp1 = 0;
        int par = 0;
        int impar = 0;
        while (num1>0) {
            comp1 = num1 % 10;
            if (comp1 % 2==0) {
                par++;
            } else if (comp1 % 2 != 0) {
                impar++; }
            num1/=10;
        }
        System.out.print("El numero tiene "+par+" numeros pares y "+impar+" numeros impares");
        sc.close();
    }
}