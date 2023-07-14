import java.util.Locale;
import java.util.Scanner;

public class uri_1002 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		double raio = input.nextDouble();
		double valorN = 3.14159;

		double area = valorN * Math.pow(raio, 2);

		System.out.println("A=" + String.format("%.4f", area));

		input.close();

	}
}
