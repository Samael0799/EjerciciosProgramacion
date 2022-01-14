package Interactivo;

import java.util.Scanner;
import java.util.Random;

public class MainPage {

	public static void main(String[] args) {
	
		Scanner datos = new Scanner(System.in);
		byte opciones;
		double num1, num2, resultado;
		Random rand = new Random();
		int numero = rand.nextInt();
		
		System.out.println("Ingrese la opcion deseada");
		System.out.println("1. Generar un numero aleatorio");
		System.out.println("2. Sumar dos numeros");
		System.out.println("3. Salir");

		opciones = datos.nextByte();
		switch(opciones) {
		case 1:
			System.out.println("El numero aleatorio es: "+numero);
			break;
		case 2:
			System.out.println("Ingrese el primer numero");
			num1= datos.nextDouble();
			System.out.println("Ingrese el segundo numero");
			num2= datos.nextDouble();
			resultado = num1+num2;
			System.out.println("El resultado de la suma es: "+resultado);
			break;
		case 3:
			System.out.println("Gracias por participar, bye");
		default:
			System.out.println("La opcion que selecciono no es valida, favor seleccionar una de las opciones del menu");
		}
	}

}
