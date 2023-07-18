import java.util.Locale;
import java.util.Scanner;

public class uri_1006 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);

		double nota1 = input.nextDouble();
		double nota2 = input.nextDouble();
		double nota3 = input.nextDouble();
		int peso1 = 2;
		int peso2 = 3;
		int peso3 = 5;

		double media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

		System.out.println("MEDIA = " + String.format("%.1f", media));

		input.close();

	}

}
