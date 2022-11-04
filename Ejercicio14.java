import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    double pot = 1;
    System.out.println("Escriba la base");
    double base = sc.nextDouble();
    System.out.println("Escriba la potencia");
    double exp = sc.nextDouble();
    
if (exp>0) {
    for (int cont=0; cont < exp; cont++) {
        pot *= base;
    }
    
}
if (exp==0) {
    pot=1;
    
}
if (exp<0) {
    for (int cont=0; cont < -exp; cont++) {
        pot *= base;
    } pot=1/pot;
}
System.out.printf("%s elevado a %s = %s", base, exp, pot);
    } 
}
