package Estruturas_Repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Resolvido_02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);

		int idade = input.nextInt();
		int soma = 0;
		int contador = 0;

		while (idade > 0) {
			soma += idade;
			contador = contador + 1;
			idade = input.nextInt();
		}

		if (contador > 0) {
			double media = (double) soma / contador;
			System.out.printf("%.2f", media);
		} else {
			System.out.println("impossivel calcular");
		}

		input.close();

	}

}
