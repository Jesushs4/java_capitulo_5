import java.util.Scanner;
public class Ejercicio47 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca la altura (número impar mayor o igual a 5): ");
        int altura = sc.nextInt();

        if (altura>=5 && (altura%2!=0)) {

        System.out.println("MMMMMM");
        for (int cont1=1; cont1<=(altura-3)/2; cont1++) {
            System.out.println("M    M");
        }
        System.out.println("MMMMMM");
        for (int cont1=1; cont1<=(altura-3)/2; cont1++) {
            System.out.println("M    M");
        }
        System.out.println("MMMMMM"); }
        else {
            System.out.println("La altura introducida no es correcta");
        }
    }
    
}
