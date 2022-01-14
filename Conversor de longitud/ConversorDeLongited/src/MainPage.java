import java.util.Scanner;

public class MainPage {

	public static void main(String[] args) {
	
		Scanner datos = new Scanner(System.in);
		byte opciones;
		double Cm, M, Millas, Km;
		
		System.out.println("Ingrese la opcion deseada");
		System.out.println("1. De Centimetros a Metros");
		System.out.println("2. De Metros a Centimetros");
		System.out.println("3. De Metros a Kilometros");
		System.out.println("4. De Kilometros a Metros");
		System.out.println("5. De Metros a Millas");
		System.out.println("6. De Millas a Metros");
		System.out.println("7. De Kilometros a Millas");
		System.out.println("8. De Millas a Kilometros");

		opciones = datos.nextByte();
		
		switch(opciones) {
		case 1:
			System.out.println("Ingrese la cantidad a convertir");
			Cm = datos.nextDouble();
			M = Cm/100;
			System.out.println(Cm+" Cm equivalen a "+M+" M");
			break;
		case 2:
			System.out.println("Ingrese la cantidad a convertir");
			M = datos.nextDouble();
			Cm = M*100;
			System.out.println(M+" M equivalen a "+Cm+" Cm");
			break;
		case 3:
			System.out.println("Ingrese la cantidad a convertir");
			M = datos.nextDouble();
			Km = M/1000;
			System.out.println(M+" M equivalen a "+Km+" Km");
			break;
		case 4:
			System.out.println("Ingrese la cantidad a convertir");
			Km = datos.nextDouble();
			M = Km*1000;
			System.out.println(Km+" Km equivalen a "+M+" M");
			break;
		case 5:
			System.out.println("Ingrese la cantidad a convertir");
			M = datos.nextDouble();
			Millas = M/1609;
			System.out.println(M+" M equivalen a "+Millas+" Millas");
			break;
		case 6:
			System.out.println("Ingrese la cantidad a convertir");
			Millas = datos.nextDouble();
			M = Millas*1609;
			System.out.println(Millas+" Millas equivalen a "+M+" M");
			break;
		case 7:
			System.out.println("Ingrese la cantidad a convertir");
			Km = datos.nextDouble();
			Millas = Km/1.609;
			System.out.println(Km+" Km equivalen a "+Millas+" Millas");
			break;
		case 8:
			System.out.println("Ingrese la cantidad a convertir");
			Millas = datos.nextDouble();
			Km = Millas*1.609;
			System.out.println(Millas+" Millas equivalen a "+Km+" Km");
			break;
		default:
			System.out.println("La opcion que selecciono no es valida");
		}
	}

}