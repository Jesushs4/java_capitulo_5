import java.util.Scanner;
public class Ejercicio25 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el numero que quiere saber cuantas cifras tiene: ");
        int num = sc.nextInt();
        int resto = 1;
        int cifras = 0;
        int cont=0;
        int divi=0;
        int uni=0;
        do {
        resto = resto*10;
        cifras++;

        } while (num / resto !=0);
        resto = 1;
        while (cifras>cont) {
        divi = num / resto;
        uni = divi % 10;
        System.out.print(uni);
        cifras--;
        resto = resto*10;
        }
        sc.close();
        
    }
}