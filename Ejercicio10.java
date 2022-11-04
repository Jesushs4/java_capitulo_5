import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long suma = 0;
        long valor = 0;
        int cont=0;

        do {
        System.out.print("Introduzca un numero: ");
        valor = sc.nextLong();
        if (valor>0) {
        suma = suma+valor;
        cont++; }

        } while (valor>0);
        double media = (double)suma/cont;
        System.out.printf("La media es %.2f", media);
    }
}
