import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int num = sc.nextInt();
        int suma = num;
        if (num>=0) {
        for (int cont=num+1; cont<=101+num; cont++) {
            suma = suma+cont;
            System.out.println(suma);
        }
    } else if (num<0) {
        System.out.println("Introduzca un numero positivo.");
    }
    }
    
}
