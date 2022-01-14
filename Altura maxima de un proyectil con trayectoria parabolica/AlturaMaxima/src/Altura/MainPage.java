package Altura;

import java.util.Scanner;

public class MainPage {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		double velocidad, v2, altura, angulo, seno, cuadrado;
		double gravedad = 9.8;
		
		System.out.println("Ingrese la velocidad con la que fue lanzado el proyectil en M/s");
		velocidad= datos.nextDouble();
		v2= Math.sqrt(velocidad);
		System.out.println("Ingrese el angulo en grados al que fue lanzado el proyectil");
		angulo= datos.nextDouble();
		seno=Math.sin(angulo);
		cuadrado=Math.sqrt(seno);
	
		altura = (v2*cuadrado)/(2*gravedad);
		
		System.out.println("La altura del proyectil es de "+altura+" Metros");
		
	}
}
