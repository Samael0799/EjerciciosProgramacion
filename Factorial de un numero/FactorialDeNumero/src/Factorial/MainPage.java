package Factorial;

import java.util.Scanner;

public class MainPage {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		double numero, factorial;
		
		System.out.println("Ingrese el numero");
		numero= datos.nextDouble();
		factorial=1;
		
		while (numero!= 0) {
			 factorial=factorial*numero; numero--;
		}
		
		System.out.println("El factorial de este numero es: "+factorial);

	}

}
