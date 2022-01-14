import java.util.Scanner;

public class MainPage {

	public static void main(String[] args) {
	
		Scanner datos = new Scanner(System.in);
		byte opciones;
		double Galon, Mc, Lt;
		
		System.out.println("Ingrese la opcion deseada");
		System.out.println("1. De Galon a Metro cubico");
		System.out.println("2. De Metro cubico a Galon");
		System.out.println("3. De Litro a Galon");
		System.out.println("4. De Galon a Litro");

		opciones = datos.nextByte();
		
		switch(opciones) {
		case 1:
			System.out.println("Ingrese la cantidad a convertir");
			Galon = datos.nextDouble();
			Mc = Galon/264;
			System.out.println(Galon+" Galones equivalen a "+Mc+" Metros cubicos");
			break;
		case 2:
			System.out.println("Ingrese la cantidad a convertir");
			Mc = datos.nextDouble();
			Galon = Mc*264;
			System.out.println(Mc+" Metros cubicos equivalen a "+Galon+" Galones");
			break;
		case 3:
			System.out.println("Ingrese la cantidad a convertir");
			Lt = datos.nextDouble();
			Galon = Lt/3.785;
			System.out.println(Lt+" Lts equivalen a "+Galon+" Galones");
			break;
		case 4:
			System.out.println("Ingrese la cantidad a convertir");
			Galon = datos.nextDouble();
			Lt = Galon*3.785;
			System.out.println(Galon+" Galones equivalen a "+Lt+" Litros");
			break;
		default:
			System.out.println("La opcion que selecciono no es valida");
		}
	}

}
