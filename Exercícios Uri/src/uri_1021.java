import java.util.Locale;
import java.util.Scanner;

public class uri_1021 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);

		double cedulas = input.nextDouble();

		System.out.println("NOTAS:");

		System.out.println((int) cedulas / 100 + " nota(s) de R$ 100.00");
		cedulas = cedulas % 100;
		System.out.println((int) cedulas / 50 + " nota(s) de R$ 50.00");
		cedulas = cedulas % 50;
		System.out.println((int) cedulas / 20 + " nota(s) de R$ 20.00");
		cedulas = cedulas % 20;
		System.out.println((int) cedulas / 10 + " nota(s) de R$ 10.00");
		cedulas = cedulas % 10;
		System.out.println((int) cedulas / 5 + " nota(s) de R$ 5.00");
		cedulas = cedulas % 5;
		System.out.println((int) cedulas / 2 + " nota(s) de R$ 2.00");
		cedulas = cedulas % 2;

		cedulas = cedulas * 100;

		System.out.println("MOEDAS:");

		System.out.println((int) cedulas / 100 + " moeda(s) de R$ 1.00");
		cedulas = (int) cedulas % 100.00;
		System.out.println((int) cedulas / 50 + " moeda(s) de R$ 0.50");
		cedulas = (int) cedulas % 50.0;
		System.out.println((int) cedulas / 25 + " moeda(s) de R$ 0.25");
		cedulas = (int) cedulas % 25.0;
		System.out.println((int) cedulas / 10 + " moeda(s) de R$ 0.10");
		cedulas = (int) cedulas % 10.0;
		System.out.println((int) cedulas / 5 + " moeda(s) de R$ 0.05");
		cedulas = (int) cedulas % 5.0;
		System.out.println((int) cedulas / 1 + " moeda(s) de R$ 0.01");
		cedulas = (int) cedulas % 1.0;

		input.close();
	}
}
