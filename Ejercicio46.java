import java.util.Scanner;
public class Ejercicio46 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca la anchura del rectángulo (como mínimo 2): ");
        int anchura = sc.nextInt();
        System.out.print("Ahora introduzca la altura (como mínimo 2): ");
        int altura = sc.nextInt();

        if (altura>=2 && anchura>=2) {

        for (int cont1=1; cont1<=anchura; cont1++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int cont2=1; cont2<=(altura)-2; cont2++) {
            System.out.print("*");
            for (int cont3=2; cont3<=(anchura*2)-2; cont3++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
            
        }
        for (int cont1=1; cont1<=anchura; cont1++) {
            System.out.print("* "); } }
        else {
            System.out.print("Lo siento, los datos introducidos no son correctos, el valor mínimo para la anchura y la altura es 2.");
        }

    }
    
}
