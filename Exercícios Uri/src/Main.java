import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double nota1;
		double nota2;
		double nota3;
		double pesoNota1 = 2.0;
		double pesoNota2 = 3.0;
		double pesoNota3 = 5.0;
		double resultPeso;
		double resultMedia;

		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		nota3 = sc.nextDouble();

		resultPeso = pesoNota1 + pesoNota2 + pesoNota3;

		resultMedia = (nota1 * pesoNota1 + nota2 * pesoNota2 + nota3 * pesoNota3) / resultPeso;

		System.out.println("MEDIA = " + resultMedia);

	}
}
