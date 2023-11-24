package com.EjercicioExtraTema2.Ejercicio;

import java.util.Scanner;

public class Solucion {
	public static void main(String[] args) {
		int[] nums = new int[7];
		Scanner ingreso = new Scanner(System.in);
		int suma = 0;
		
		for (int i = 0; i < 7; i++) {
			System.out.println("Ingrese un numero para el vector: ");
			int num = ingreso.nextInt();
			nums[i] = num;
			suma += num;
		}
		ingreso.close();
		double promedio = (double) suma/ (double) nums.length;
		
		System.out.println("El promedio de los numeros introducidos es de: " + promedio);
		System.out.println(promedio % 2 == 0 ? "El promedio es un numero par" : "El promedio es un numero impar");
		
	}
}
