import java.util.Scanner;
public class Ejercicio31 {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Escriba la altura de la L: ");
    int altura = sc.nextInt();
    for (int i=1; i<=altura-1; i++) {
        System.out.println("*");
    }
    for (int j=1; j<=(altura/2)+1; j++) {
        System.out.print("* ");
    }
    }
}
