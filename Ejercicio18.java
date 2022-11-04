import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el numero de menor valor: ");
        int num1 = sc.nextInt();
        System.out.print("Introduzca el numero de mayor valor: ");
        int num2 = sc.nextInt();
        if (num1!=num2) {
        for (int cont=num1+1; cont<=num2-1; cont+=7) {
            System.out.print(cont+" "); }
        } else {
            System.out.println("Introduzca dos numeros distintos");
        }
    }
}
