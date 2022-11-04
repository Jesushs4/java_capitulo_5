import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean comp = false;
        int cont = 2;
        int resto = 0;
        System.out.print("Introduzca el numero que quiere comprobar si es primo: ");
        int num = sc.nextInt();
        while ((comp==false) && (num/2>cont)) {
            resto = num % cont;
            if (resto==0) {
                comp=true;
            }
            cont++;

        }
        if (comp==true) {
            System.out.println("No es primo");
        } else if(comp==false) {
            System.out.println("Es primo");
        }
    }
}
