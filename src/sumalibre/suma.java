package sumalibre;
import JarLibreria.*;
import libreria.*;
public class suma {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduzca dos num");
        int n1 = teclado.nextInt();
        System.out.println("Otro");
        int n2 = teclado.nextInt();
        System.out.println(sumalibre.Suma(n1,n2));
    }
}
