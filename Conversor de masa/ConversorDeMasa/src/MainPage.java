import java.util.Scanner;

public class MainPage {

	public static void main(String[] args) {
	
		Scanner datos = new Scanner(System.in);
		byte opciones;
		double Lb, Gr, Onz, Kl;
		
		System.out.println("Ingrese la opcion deseada");
		System.out.println("1. De Libras a Gramos");
		System.out.println("2. De Gramos a Libras");
		System.out.println("3. De Libras a Onzas");
		System.out.println("4. De Onzas a Libras");
		System.out.println("5. De Onzas a Gramos");
		System.out.println("6. De Gramos a Onzas");
		System.out.println("7. De Kilos a Libras");
		System.out.println("8. De Libras a Kilos");
		System.out.println("9. De Kilos a Onzas");
		System.out.println("10. De Onzas a Kilos");

		opciones = datos.nextByte();
		
		switch(opciones) {
		case 1:
			System.out.println("Ingrese la cantidad a convertir");
			Lb = datos.nextDouble();
			Gr = Lb*453.592;
			System.out.println(Lb+" Lbs equivalen a "+Gr+" Gramos");
			break;
		case 2:
			System.out.println("Ingrese la cantidad a convertir");
			Gr = datos.nextDouble();
			Lb = Gr/453.592;
			System.out.println(Gr+" Gramos equivalen a "+Lb+" Lbs");
			break;
		case 3:
			System.out.println("Ingrese la cantidad a convertir");
			Lb = datos.nextDouble();
			Onz = Lb*16;
			System.out.println(Lb+" Lbs equivalen a "+Onz+" Onzs");
			break;
		case 4:
			System.out.println("Ingrese la cantidad a convertir");
			Onz = datos.nextDouble();
			Lb = Onz/16;
			System.out.println(Onz+" Onzs equivalen a "+Lb+" Lbs");
			break;
		case 5:
			System.out.println("Ingrese la cantidad a convertir");
			Onz = datos.nextDouble();
			Gr = Onz*28.3495;
			System.out.println(Onz+" Onzs equivalen a "+Gr+" Gramos");
			break;
		case 6:
			System.out.println("Ingrese la cantidad a convertir");
			Gr = datos.nextDouble();
			Onz = Gr/28.3495;
			System.out.println(Gr+" Gramos equivalen a "+Onz+" Onzas");
			break;
		case 7:
			System.out.println("Ingrese la cantidad a convertir");
			Kl = datos.nextDouble();
			Lb = Kl*2.205;
			System.out.println(Kl+" Kls equivalen a "+Lb+" Lbs");
			break;
		case 8:
			System.out.println("Ingrese la cantidad a convertir");
			Lb = datos.nextDouble();
			Kl = Lb/2.205;
			System.out.println(Lb+" Lbs equivalen a "+Kl+" Kls");
			break;
		case 9:
			System.out.println("Ingrese la cantidad a convertir");
			Kl = datos.nextDouble();
			Onz = Kl*35.274;
			System.out.println(Kl+" Kls equivalen a "+Onz+" Onzs");
			break;
		case 10:
			System.out.println("Ingrese la cantidad a convertir");
			Onz = datos.nextDouble();
			Kl = Onz/35.274;
			System.out.println(Onz+" Onzs equivalen a "+Kl+" Kls");
			break;
		default:
			System.out.println("La opcion que selecciono no es valida");
		}
	}

}