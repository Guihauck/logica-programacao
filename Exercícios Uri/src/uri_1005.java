import java.util.Locale;
import java.util.Scanner;

public class uri_1005 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);

		double nota1 = input.nextDouble();
		double nota2 = input.nextDouble();
		double peso1 = 3.5;
		double peso2 = 7.5;
		double resultMedia;

		resultMedia = (nota1 * peso1 + nota2 * peso2) / (peso1 + peso2);

		System.out.println("MEDIA = " + String.format("%.5f", resultMedia));

		input.close();

	}

}
