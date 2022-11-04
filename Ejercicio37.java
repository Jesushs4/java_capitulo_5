import java.util.Scanner;
public class Ejercicio37 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int num1 = sc.nextInt();
        int comp = 0;
        int comp2 = 0;
        while (num1 > 0) {
            comp= (comp*10) + num1%10;
            num1/=10;
        }
        while (comp > 0) {
            comp2=comp%10;
            
            for (int cont=1; cont<=comp2; cont++) {
                System.out.print("| "); }
            if (comp>10) { 
            System.out.print("- "); } 
            comp/=10; 
        }
    }
        
}
