import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double base;
		double altura;
		double area;
		double perimetro;
		double diagonal;

		base = sc.nextDouble();
		altura = sc.nextDouble();

		area = base * altura;
		perimetro = 2.0 * base + 2.0 * altura;
		diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));

		System.out.printf("AREA = %.4f%n", area);
		System.out.printf("PERIMETRO = %.4f%n", perimetro);
		System.out.printf("DIAGONAL = %.4f%n", diagonal);

		sc.close();
	}

}
