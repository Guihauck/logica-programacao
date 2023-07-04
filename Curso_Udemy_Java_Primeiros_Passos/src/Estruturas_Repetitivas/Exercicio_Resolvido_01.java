package Estruturas_Repetitivas;

import java.util.Scanner;

public class Exercicio_Resolvido_01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int numerox = input.nextInt();
		int numeroy = input.nextInt();

		while (numerox != numeroy) {
			if (numerox < numeroy) {
				System.out.println("Crescente");
			} else {
				System.out.println("Decrescente");

			}
			numerox = input.nextInt();
			numeroy = input.nextInt();
		}

		input.close();

	}

}
