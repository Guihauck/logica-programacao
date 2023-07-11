import java.util.Locale;
import java.util.Scanner;

public class uri_1154 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		double soma = 0, idade = 0, media = 0;
		int contador = 0;
		
		while (idade >= 0) {
			idade = input.nextDouble();

			if (idade >= 0) {
				soma += idade;
				contador++;
			}
		}

		media = soma / contador;
		System.out.printf("%.2f\n", media);

		input.close();

	}
}
