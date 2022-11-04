import java.util.Scanner;
public class Ejercicio24 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 1;
        boolean comp = true;
        System.out.print("Introduzca la altura de la pirámide: ");
        int altura = sc.nextInt();
        for (int cont1=1; cont1<=altura*2; cont1+=2) {
            for (cont2=cont1; cont2<=altura*2; cont2+=2) {
                System.out.print(" ");
            }
            for (cont2=cont1; cont2>=1; cont2--) {
                if (cont3==cont4) {
                    comp = false;
                }
                if (comp==true) {
                cont3++; }
                if (comp==false) {
                    cont3--;
                }
                System.out.print(cont3);
            } 
            System.out.println(""); 
            cont3=0;
            cont4++;
            comp = true;
        }
    }
}