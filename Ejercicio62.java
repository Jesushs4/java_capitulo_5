import java.util.Scanner;
public class Ejercicio62 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int num1 = sc.nextInt();
        int verify = num1;
        int rest = 0;
        int lucky = 0;
        int unlucky = 0;
        while (verify>0) {
            rest = verify % 10;
            if (rest==3 || rest==7 || rest==8 || rest==9) {
                lucky++;
            } else if (rest==0 || rest==1 || rest==2 || rest==4 || rest==5 || rest==6 ) {
                unlucky++;
            }
            verify/=10;
        }
        if (lucky>unlucky) {
            System.out.printf("El %d es un número afortunado",num1);
        } else if (lucky<=unlucky) {
            System.out.printf("El %d no es un número afortunado",num1);
        }
    }
    
}
