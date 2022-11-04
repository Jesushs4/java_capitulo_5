import java.util.Scanner;
public class Ejercicio33 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la U: ");
        int altura = sc.nextInt();

        if (altura % 2 == 0) {
        for (int cont=1; cont<=altura-1; cont++) {
            System.out.print("*");
            for (int cont2=1; cont2<=altura/2; cont2++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        System.out.print(" ");
        for (int cont=1; cont<=altura/2; cont++) {
            System.out.print("*"); } }
        
            if (altura % 2 != 0) {
                for (int cont=1; cont<=altura-1; cont++) {
                    System.out.print("*");
                    for (int cont2=1; cont2<=altura/2+1; cont2++) {
                        System.out.print(" ");
                    }
                    System.out.println("*");
                }
                System.out.print(" ");
                for (int cont=1; cont<=altura/2+1; cont++) {
                    System.out.print("*"); } }
            
        }
    }
