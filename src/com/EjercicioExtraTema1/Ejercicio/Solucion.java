package com.EjercicioExtraTema1.Ejercicio;

import java.util.Scanner;

public class Solucion {
	public static void main(String[] args) {
		Scanner ingreso = new Scanner(System.in);
		int num;
		int numIntroducidos = 0;
		int suma = 0;
		
		do {
			System.out.println("Ingrese un numero: ");
			num = ingreso.nextInt();
			suma += num;
			
			// Si bien la aplicacion se detendrá al introducir el 0, la iteracion de igual forma se ejecuta
			// Por lo que considerará sumar +1 a los numeros introducidos aun si es 0
			// Por eso la condicional
			if(num != 0) {
				numIntroducidos++;
			}
		
		} while (num != 0);
		
		double media  = (double)suma / (double)numIntroducidos;
		ingreso.close();
		System.out.println("El total de la suma es de " + suma);
		System.out.println("La media de los numeros introducidos es de "+ media);
	}
}
