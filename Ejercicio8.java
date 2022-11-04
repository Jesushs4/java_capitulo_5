import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el numero del que quiere ver la tabla de multiplicar: ");
        int num = sc.nextInt();
        for (int cont=0; cont<=10; cont++) {
            System.out.printf("%d x %d = %d \n",num,cont,num*cont);

        }

    }
    
}
