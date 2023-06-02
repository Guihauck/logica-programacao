import java.util.Locale;
import java.util.Scanner;

public class uri_1015 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);

		double x1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y1 = input.nextDouble();
		double y2 = input.nextDouble();

		double p1 = Math.pow(x1 - y1, 2.0) + Math.pow(x2 - y2, 2.0);
		double p2 = Math.sqrt(p1);

		System.out.printf("%.4f%n" , p2);

		input.close();
	}
}
