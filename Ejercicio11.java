import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el numero del que quiere ver el cuadrado y el cubo de este y de sus 4 primeros: ");
        int num = sc.nextInt();
        System.out.println("  n   |   n^2  |   n^3");
        System.out.println("----------------------");
        for (int cont=0; cont<=4; cont++) {
            System.out.println("  "+num+cont+"  |  "+Math.pow(num+cont, 2)+"  |  "+Math.pow(num+cont, 3));
        } sc.close();
    }
}