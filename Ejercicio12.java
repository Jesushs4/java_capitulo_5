import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca cuantos numeros de la serie quiere que se muestren: ");
        int serie = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        for (int cont=1; cont<=serie; cont++) {
            if (num1<=num2) {
                System.out.println(num1);
                num1=num1+num2;
            } else if (num2<num1) {
                System.out.println(num2);
                num2=num2+num1;
            }
        }
        }
    }
