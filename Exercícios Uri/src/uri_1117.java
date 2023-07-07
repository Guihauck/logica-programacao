import java.util.Locale;
import java.util.Scanner;

public class uri_1117 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);

		float digiteNota, notaValida = 0, totalNotaValida = 0, media = 0;

		while (totalNotaValida != 2) {
			digiteNota = input.nextFloat();

			if (digiteNota > 0 && digiteNota <= 10) {

				notaValida = notaValida + digiteNota;
				totalNotaValida = totalNotaValida + 1;
			}

			else {
				System.out.println("nota invalida");
			}
		}

		media = notaValida / 2;
		System.out.printf("media = %.2f\n", media);

		input.close();
	}

}
