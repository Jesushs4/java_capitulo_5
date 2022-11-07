import java.util.Scanner;
public class Ejercicio42 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero entero positivo: ");
        int num = sc.nextInt();
        int cont2 = 2;
        boolean comp = false;
        for (int cont1=0; cont1<=4; cont1++) {
            while ((num+cont1)>cont2 && comp==false) {
                if ((num+cont1)%cont2==0) {
                    comp = true;
                }
                else
                cont2++;
            }
            if (comp==false) {
                System.out.println(cont1+num+" es primo.");
            } else if (comp==true) {
                System.out.println(cont1+num+" no es primo.");
            }
            comp = false;
            cont2 = 2;
        }
    }
}
