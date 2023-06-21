import java.util.Locale;
import java.util.Scanner;

public class uri_1037 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);

		double escrevaNumero = input.nextDouble();

		if (escrevaNumero >= 0 && escrevaNumero <= 25) {
			System.out.println("Intervalo [0,25]");
		}

		else if (escrevaNumero >= 25 && escrevaNumero <= 50) {
			System.out.println("Intervalo (25,50]");
		}

		else if (escrevaNumero >= 50 && escrevaNumero <= 75) {
			System.out.println("Intervalo (50,75]");
		}
		else if (escrevaNumero >= 75 && escrevaNumero <= 100) {
			System.out.println("Intervalo (75,100]");
		}
		else {
			System.out.println("Fora de intervalo");
		}

		input.close();
	}
}
