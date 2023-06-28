package Ejercicios4;

import java.util.Scanner;

public class Ej4_3 {

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca un número:");
		int num = teclado.nextInt();
		int cont = 1;
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
	}

}
