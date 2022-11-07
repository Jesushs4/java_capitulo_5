import java.util.Scanner;
public class Ejercicio48 {
    public static void main(String args[] ) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero entero: ");
        long num = sc.nextLong();
        long num2 = num;
        long dig = 0;
        boolean comp = false;
        System.out.print("Digitos que aparecen: ");
        for (int cont1=0; cont1<=9; cont1++) {
            while (comp==false && num2>0) {
                dig = num2 % 10;
                num2 /= 10;
                if (dig==cont1) {
                    System.out.print(cont1+" ");
                    comp = true;
                }
                
            }
            num2 = num;
            comp = false;
                
        }
        System.out.println();
        System.out.print("Digitos que no aparecen: ");
        for (int cont1=0; cont1<=9; cont1++) {
            while (comp==false && num2>0) {
                dig = num2 % 10;
                num2 /= 10;
                if (dig==cont1) {
                    comp = true;
                }
                
            }
            num2 = num;
            if (comp==false) {
                System.out.print(cont1+" ");
            }
            comp=false;
                
        }

    }
}
