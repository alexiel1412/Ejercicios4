package Ejercicios4;

import java.util.Scanner;

public class Ej4_1 {

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca un número:");
		int num = teclado.nextInt();
		int cont = 1;
		for (int i = 1; i <= num; i++)
		{
			cont = 1;
			while (cont <= i)
			{
				System.out.print("*");
				/*
				if (cont != i)
					System.out.print(" ");
				*/
				cont++;
			}
			System.out.println();
		}
		
		
		for (int i = 1; i <= num; i++)
		{
			cont = 0;
			for (int j = 1; j <= num - i; j++)
			{
				System.out.print(" ");
			}
			while (cont < i)
			{
				cont++;
				System.out.print("*");
				if (cont != i)
					System.out.print(" ");
			}
			for (int j = 1; j <= num - i; j++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= num - 1; i++)
		{
			cont = num - i + 1;
			for (int j = i; j >= 1; j--)
			{
				System.out.print(" ");
			}
			while (cont > 1)
			{
				cont--;
				System.out.print("*");
				if (cont != 1)
					System.out.print(" ");
			}
			for (int j = i; j >= 1; j--)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
