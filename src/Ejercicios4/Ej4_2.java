package Ejercicios4;

import java.util.Scanner;

public class Ej4_2
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca un número:");
		int num = teclado.nextInt();
		int cont = num;
		for (int i = num; i >= 1; i--)
		{
			cont = i;
			while (cont >= 1)
			{
				System.out.print("*");
				/*
				if (cont != i)
					System.out.print(" ");
				*/
				cont--;
			}
			System.out.println();
		}
	}

}
