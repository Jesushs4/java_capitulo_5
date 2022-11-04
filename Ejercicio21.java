import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    boolean neg = false;
    int num = 0;
    int mayor = 0;
    int cont = 0;
    int contneg = 0;
    int suma = 0;
    while (neg==false) {
        System.out.print("Introduzca un numero: ");
        num = sc.nextInt();
        if ((num % 2)==0 && num>=0) {
            if (num>mayor) {
                mayor = num;
            } cont++;
        } else if ((num%2)!=0 && num>=0) {
            suma = suma+num;
            contneg++;
            cont++; }
            else if (num<0) {
            neg=true;
            }
        }
        System.out.printf("Se han introducido %s numeros, la media de los impares es de %s, el mayor de los pares es %s",cont,(double)suma/contneg,mayor);
    }
    }
