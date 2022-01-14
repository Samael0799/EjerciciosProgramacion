import java.util.Scanner;

public class MainPage {

	public static void main(String[] args) {
	
		Scanner datos = new Scanner(System.in);
		byte opciones;
		double Kelvin, Celsius, Farenheit;
		
		System.out.println("Ingrese la opcion deseada");
		System.out.println("1. De Celcius a Farenheit");
		System.out.println("2. De Celcius a Kelvin");
		System.out.println("3. De Farenheit a Celsius");
		System.out.println("4. De Farenheit a Kelvin");
		System.out.println("5. De Kelvin a Celcius");
		System.out.println("6. De Kelvin a Farenheit");

		opciones = datos.nextByte();
		
		switch(opciones) {
		case 1:
			System.out.println("Ingrese la cantidad a convertir");
			Celsius = datos.nextDouble();
			Farenheit = (Celsius*9/5)+32;
			System.out.println(Celsius+" grados Celsius equivalen a "+Farenheit+" grados Farenheit");
			break;
		case 2:
			System.out.println("Ingrese la cantidad a convertir");
			Celsius = datos.nextDouble();
			Kelvin = Celsius+273.15;
			System.out.println(Celsius+" grados Celsius equivalen a "+Kelvin+" grados Kelvin");
			break;
		case 3:
			System.out.println("Ingrese la cantidad a convertir");
			Farenheit = datos.nextDouble();
			Celsius = (Farenheit-32)*5/9;
			System.out.println(Farenheit+" grados Farenheit equivalen a "+Celsius+" grados Celsius");
			break;
		case 4:
			System.out.println("Ingrese la cantidad a convertir");
			Farenheit = datos.nextDouble();
			Kelvin = (Farenheit-32)*5/9+273.15;
			System.out.println(Farenheit+" grados Farenheit equivalen a "+Kelvin+" grados Kelvin");
			break;
		case 5:
			System.out.println("Ingrese la cantidad a convertir");
			Kelvin = datos.nextDouble();
			Celsius = Kelvin-273.15;
			System.out.println(Kelvin+" grados Kelvin equivalen a "+Celsius+" grados Celsius");
			break;
		case 6:
			System.out.println("Ingrese la cantidad a convertir");
			Kelvin = datos.nextDouble();
			Farenheit = (Kelvin-273.15)*9/5+32;
			System.out.println(Kelvin+" grados Kelvin equivalen a "+Farenheit+" grados Farenheit");
			break;
		default:
			System.out.println("La opcion que selecciono no es valida");
		}
	}

}
