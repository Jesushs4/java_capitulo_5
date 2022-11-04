import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    double pot = 1;
    System.out.println("Escriba la base");
    double base = sc.nextDouble();
    System.out.println("Escriba la potencia");
    double exp = sc.nextDouble();
    
if (exp>0) {
    for (int cont=1; cont <= exp; cont++) {
        pot *= base;
        System.out.printf("%s ^ %s = %s \n", base, cont, pot);
    }
    
}
if (exp==0) {
    pot=1;
    
}
if (exp<0) {
    for (int cont=1; cont <= -exp; cont++) {
        pot *= base;
        System.out.printf("%s ^ %s = %s \n", base, -cont, 1/pot);
    }
}
    } 
}
