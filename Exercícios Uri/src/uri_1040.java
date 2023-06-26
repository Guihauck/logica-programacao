import java.util.Locale;
import java.util.Scanner;

public class uri_1040 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);

		float N1 = input.nextFloat();
		float N2 = input.nextFloat();
		float N3 = input.nextFloat();
		float N4 = input.nextFloat();
		float mediaFinal;
		float notaExame;
		int peso1 = 2;
		int peso2 = 3;
		int peso3 = 4;
		int peso4 = 1;

		float media = ((N1 * peso1) + (N2 * peso2) + (N3 * peso3) + (N4 * peso4)) / (peso1 + peso2 + peso3 + peso4);

		if (media >= 7.0) {
			System.out.println("Media: " + String.format("%.1f", media));
			System.out.println("Aluno aprovado.");
		}

		else if (media < 5.0) {
			System.out.println("Media: " + String.format("%.1f", media));
			System.out.println("Aluno reprovado.");
		}

		else {
			System.out.println("Media: " + String.format("%.1f", media));
			System.out.println("Aluno em exame.");
			notaExame = input.nextFloat();
			System.out.println("Nota do exame: " + notaExame);
			mediaFinal = (notaExame + media) / 2;

			if (mediaFinal >= 5.0) {
				System.out.println("Aluno aprovado.");
				System.out.println("Media final: " + String.format("%.1f", mediaFinal));
			}

			else {
				System.out.println("Aluno reprovado.");
				System.out.println("Media final: " + String.format("%.1f", mediaFinal));
			}
			input.close();

		}
	}
}
