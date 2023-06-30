import java.util.Locale;
import java.util.Scanner;

public class uri_1051 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		double salario, imposto = 0.00, diferenca;

		Scanner input = new Scanner(System.in);

		salario = input.nextDouble();

		if (salario > 4500.00) {
			imposto = (1000 * 0.08) + (1500.00 * 0.18);
			diferenca = salario - 4500.00;
			imposto = imposto + diferenca * 0.28;

		}

		else if (salario > 3000.01 && salario <= 4500.00) {
			imposto = (1000 * 0.08);
			diferenca = salario - 3000.00;
			imposto = imposto + diferenca * 0.18;
		}

		else if (salario > 2000.01 && salario <= 3000.00) {
			diferenca = salario - 2000.00;
			imposto = imposto + diferenca * 0.08;

		}

		if (imposto > 0.00) {
			System.out.printf("R$ %.2f\n", imposto);
		}

		else {
			System.out.println("Isento");
		}
		input.close();

	}

}
