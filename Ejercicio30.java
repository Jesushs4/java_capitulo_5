import java.util.Scanner;
public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numDia1 = 0;
        int hora1 = 0;
        int numDia2 = 0;
        int hora2 = 0;
        int horasTranscurridas2 = 0;
        boolean datosCorrectos = true;

        do {
            System.out.println("¿Cuál es el primer día?");
            String dia = sc.next();
            switch (dia.toLowerCase()) {
                case "lunes",  "1":
                    numDia1 = 0;
                    break;
                case "martes", "2":
                    numDia1 = 1;
                    break;
                case "miercoles", "miércoles", "3":
                    numDia1 = 2;
                    break;
                case "jueves", "4":
                    numDia1 = 3;
                    break;
                case "viernes", "5":
                    numDia1 = 4;
                    break;
                case "sabado", "6":
                    numDia1 = 5;
                    break;
                case "domingo", "7":
                    numDia1 = 6;
                    break;
                default:
                    System.out.println("Introduzca un día válido");
                    datosCorrectos = false;
                    break;
            }
        } while (!datosCorrectos);

        do {
            System.out.println("Ahora introduzca la primera hora: ");
            hora1 = sc.nextInt();
            if (hora1<0 || hora1>24) {
                System.out.println("Introduzca una hora correcta");
                datosCorrectos = false;
            }
        } while (!datosCorrectos);

        int horasTranscurridas1 = 24*numDia1 + hora1;

        do {
            do {
                datosCorrectos = true;
                System.out.println("¿Cuál es el segundo día?");
                String dia = sc.next();
                switch (dia.toLowerCase()) {
                    case "lunes", "1":
                        numDia2 = 0;
                        break;
                    case "martes", "2":
                        numDia2 = 1;
                        break;
                    case "miercoles", "miércoles", "3":
                        numDia2 = 2;
                        break;
                    case "jueves", "4":
                        numDia2 = 3;
                        break;
                    case "viernes", "5":
                        numDia2 = 4;
                        break;
                    case "sabado", "6":
                        numDia2 = 5;
                        break;
                    case "domingo", "7":
                        numDia2 = 6;
                        break;
                    default:
                        System.out.println("Introduzca un día válido");
                        datosCorrectos = false;
                        break;
                }
            } while (!datosCorrectos);

            do {
                System.out.println("Ahora introduzca la segunda hora: ");
                hora2 = sc.nextInt();
                if (hora2<0 || hora2>=24) {
                    System.out.println("Introduzca una hora correcta");
                    datosCorrectos = false;
                }
            } while (!datosCorrectos);

            horasTranscurridas2 = numDia2*24 + hora2;
            if (horasTranscurridas2<=horasTranscurridas1) {
                System.out.println("La segunda hora debe ser posterior a la primera");
                datosCorrectos = false;
            }
        } while (!datosCorrectos);

        System.out.printf("Entre la primera hora y la segunda han pasado %d horas", horasTranscurridas2-horasTranscurridas1);

        sc.close();
    }
}
    
