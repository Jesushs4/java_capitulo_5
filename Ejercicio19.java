import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int cont2 = 0;
        System.out.print("Introduzca la altura de la pirámide: ");
        int altura = sc.nextInt();
        System.out.print("Introduzca el carácter: ");
        char cara = sc.next().charAt(0);
        for (int cont1=1; cont1<=altura*2; cont1+=2) {
            for (cont2=cont1; cont2<=altura*2-2; cont2+=2) {
                System.out.print(" ");
            }
            for (cont2=cont1; cont2>=1; cont2--) {
                System.out.print(cara);
            } 
            System.out.println(""); 
        }
    }
 }
