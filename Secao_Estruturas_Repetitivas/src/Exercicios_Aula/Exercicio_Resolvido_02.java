package Exercicios_Aula;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Resolvido_02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);

		double A = input.nextDouble();
		double B = input.nextDouble();
		double C = input.nextDouble();

		double delta = Math.pow(B, 2) - 4 * A * C;

		if (A == 0 || delta < 0.00) {
			System.out.println("Impossível calcular!");
		}

		else {
			double R1 = (-B + Math.sqrt(delta)) / (2 * A);
			double R2 = (-B - Math.sqrt(delta)) / (2 * A);
			System.out.printf("R1 = %.5f%n", R1);
			System.out.printf("R2 = %.5f%n", R2);
		}

		input.close();

	}
}
