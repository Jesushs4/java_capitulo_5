import java.util.Scanner;
public class Ejercicio51 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero (mayor que cero): ");
        int num = sc.nextInt();
        int numresto = 0;
        int numvolt = 0;
        boolean comp = false;
        while (num > 0) {
            numvolt *= 10;
            numresto = num % 10;
            if (numresto==0 || numresto==8) {
                comp=true;
            }
            numvolt += numresto;
            num /= 10;
        }
        if (comp==true) {
            System.out.print("Después de haber sido comido por el gusano numérico se queda en ");
            while (numvolt > 0) {
             numresto = numvolt % 10;
             if (numresto!=0 && numresto!=8) {
                System.out.print(numresto);
             }
             numvolt /= 10;
            }
        }
        if (comp==false) {
            System.out.print("El gusano numérico no se ha comido ningún digito.");
        }
        
    }
}
