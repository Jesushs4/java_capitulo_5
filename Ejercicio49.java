import java.util.Scanner;
public class Ejercicio49 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean comp = false;
        boolean primo = false;
        int contprimo = 2;
        int cont = 0;
        int mininum = 0;
        int maxnum = 0;
        int suma = 0;
        System.out.println("Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo:");
        while (comp == false) {
            int num = sc.nextInt();
            while (primo == false & contprimo<num) {
                if (num % contprimo == 0) {
                    primo = true;

                }
                else {
                    contprimo++;
                }
            }
            if (primo == true) {
                cont++;
                suma += num;
                if (maxnum<num) {
                    maxnum = num;
                }
                if (mininum==0 || mininum>num) {
                    mininum = num;
                } primo = false;

            } else if (primo == false) {
                comp = true;
            }
            
        }
        System.out.println("Has introducido "+cont+" numeros no primos");
        System.out.println("Máximo: "+maxnum);
        System.out.println("Mínimo: "+mininum);
        System.out.println("Media: "+((float)suma/cont));
    }
}
