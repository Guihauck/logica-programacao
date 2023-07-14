import java.util.Locale;
import java.util.Scanner;

public class uri_1017 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);

		int tempoViagem = input.nextInt();
		int velocidadeMedia = input.nextInt();
		double gasosaPorKm = 12.00;
		double resultado;

		resultado = tempoViagem * velocidadeMedia / gasosaPorKm;

		System.out.printf("%.3f\n", resultado);

		input.close();

	}
}
