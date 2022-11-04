import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int codigo = 4295;
        int cont = 1;
        boolean comp = false;
        do {
            System.out.printf("Pruebe una combinacion de 4 digitos (Intento %s): ", cont);
            int prueba = sc.nextInt();
            if (prueba==codigo) {
                comp=true;
            } else cont++;
        } while ((comp==false) && (cont<=4));
        if (comp==true) {
            System.out.println("La caja fuerte se ha abierto satisfactoriamente");
        } else {
            System.out.println("Lo siento, esa no es la combinacion correcta");
        }
    }
    
}
