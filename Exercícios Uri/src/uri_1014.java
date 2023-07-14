import java.util.Locale;
import java.util.Scanner;

public class uri_1014 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);

		int distancia = input.nextInt();
		double combustivelGasto = input.nextDouble();
		double resultado;

		resultado = distancia / combustivelGasto;

		System.out.println(String.format("%.3f", resultado) + " km/l");

		input.close();

	}
}
