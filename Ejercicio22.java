public class Ejercicio22 {
    public static void main(String args[]) {
        boolean comp = false;
        int resto = 0;
        int cont2 = 2;
        for (int cont1=2; cont1<=100; cont1++) {
            while ((comp==false) && (cont1>cont2)) {
                resto = cont1 % cont2;
                if (resto==0) {
                    comp=true;
        } else {
            cont2++; }
    } cont2=2;
    if (comp==false) {
        System.out.print(cont1+" ");
    } else {
        comp=false;
    }
    }
}
}