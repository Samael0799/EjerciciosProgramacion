import java.util.Scanner;

public class MainPage {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		double distancia, velocidad, tiempo;
		byte opciones;
		
		System.out.println("Ingrese la opcion que desea");
		System.out.println("1. Velocidad en KM/h");
		System.out.println("2. Velocidad en Millas/h");
		System.out.println("3. Velocidad en M/s");
		
		opciones = datos.nextByte();
		
		switch(opciones) {
		
		case 1:
			System.out.println("Ingrese la Distancia en Km");
			distancia=datos.nextDouble();
			System.out.println("Ingrese el tiempo en horas");
			tiempo = datos.nextDouble();
			velocidad = distancia/tiempo;
			System.out.println("La velocidad de movimiento es de "+velocidad+" Km/h.");
			break;
		case 2:
			System.out.println("Ingrese la Distancia en Millas");
			distancia=datos.nextDouble();
			System.out.println("Ingrese el tiempo en horas");
			tiempo = datos.nextDouble();
			velocidad = distancia/tiempo;
			System.out.println("La velocidad de movimiento es de "+velocidad+" Millas/h.");
			break;
		case 3:
			System.out.println("Ingrese la Distancia en M");
			distancia=datos.nextDouble();
			System.out.println("Ingrese el tiempo en segundos");
			tiempo = datos.nextDouble();
			velocidad = distancia/tiempo;
			System.out.println("La velocidad de movimiento es de "+velocidad+" M/s.");
			break;
		default:
			System.out.println("No existe esta opcion");
		
		}
		

	}

}
