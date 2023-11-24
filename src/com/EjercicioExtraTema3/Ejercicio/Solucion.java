package com.EjercicioExtraTema3.Ejercicio;

import java.util.Scanner;

public class Solucion {
	public static void main(String[] args) {
		Scanner ingreso = new Scanner(System.in);
		System.out.println("Ingrese el numero para sacar el factorial: ");
		int myNum = ingreso.nextInt();
		
		System.out.println("El factorial de " + myNum + " es " + factorial(myNum));
		ingreso.close();
	}
	public static int factorial(int num) {
		
		int resultado = num;
		for (int i = num-1; i > 0 ; i--) {
			resultado *=i;
		}
		
		return resultado;
	}
}
