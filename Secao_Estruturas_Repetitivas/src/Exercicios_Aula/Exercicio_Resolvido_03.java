package Exercicios_Aula;

import java.util.Scanner;

public class Exercicio_Resolvido_03 {

	public static void main(String[] args) {

		Scanner escrevaNumero = new Scanner(System.in);

		int numero1 = escrevaNumero.nextInt();
		int numero2 = escrevaNumero.nextInt();
		int numero3 = escrevaNumero.nextInt();

		if (numero1 < numero2 && numero2 < numero3)
			System.out.println("MENOR: " + numero1);
		else {
			if (numero2 < numero3)
				System.out.println("MENOR: " + numero2);
			else {
				System.out.println("MENOR: " + numero3);
			}
		}

		escrevaNumero.close();
	}

}
