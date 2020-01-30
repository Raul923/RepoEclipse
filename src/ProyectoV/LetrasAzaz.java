package ProyectoV;
import java.util.Scanner;
public class LetrasAzaz {
	 public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
		 String palabra;
		 int numero,aux = 1;
		 System.out.println("Escriba un numero por teclado");
		 	numero = teclado.nextInt();
		 	
		 	for (int i = 0; i < 20 ; i++) {
				aux = aux*numero;
		 		aux =(char)Math.round(65+25*Math.random());
		 		System.out.println((char)aux);
			}
		 	
		 
	 }
}
