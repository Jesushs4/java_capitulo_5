import java.util.Scanner;
public class Ejercicio40  {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura del rombo: ");
        int altura = sc.nextInt();
        if (altura % 2 != 0 && altura>=3) {

            for (int cont1=altura; cont1>=1; cont1-=2) {
                for (int cont2=1; cont2<=cont1; cont2+=2) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int cont3=cont1; cont3<=altura-2; cont3++) {
                    System.out.print(" ");
                }
                if (cont1!=altura) {
                    System.out.print("*"); }
                System.out.println(); }
            
                    
                        for (int cont1=3; cont1<=altura; cont1+=2) {
                            for (int cont2=1; cont2<=cont1; cont2+=2) {
                                System.out.print(" ");
                            }
                            System.out.print("*");
                            for (int cont3=cont1; cont3<=altura-2; cont3++) {
                                System.out.print(" ");
                            }
                            if (cont1!=altura) {
                                System.out.print("*"); }
                            System.out.println(); }
        } else {
            System.out.println("Introduzca una altura impar y mayor o igual que 3.");
        }
    }
}