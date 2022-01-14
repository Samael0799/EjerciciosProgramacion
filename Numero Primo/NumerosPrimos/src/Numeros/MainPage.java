package Numeros;

import java.util.Scanner;

public class MainPage {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
        int contador,inicial,numero;
 
        System.out.print("Ingresa un numero: ");
        numero = datos.nextInt();
        contador = 0;
        for(inicial = 1; inicial <= numero; inicial++)
        {
            if((numero % inicial) == 0)
            {
                contador++;
            }
        }
 
        if(contador <= 2)
        {
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }
    }

	}

