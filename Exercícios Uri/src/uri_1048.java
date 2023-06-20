import java.util.Locale;
import java.util.Scanner;

public class uri_1048 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);

		double salario, salarioNovo, reajuste;
		int percentual;

		salario = input.nextDouble();

		if (salario >= 0 && salario <= 400.00) {
			salarioNovo = salario * 1.15;
			reajuste = salarioNovo - salario;
			percentual = 15;
		}

		else if (salario >= 400.01 && salario <= 800.00) {
			salarioNovo = salario * 1.12;
			reajuste = salarioNovo - salario;
			percentual = 12;
		}

		else if (salario >= 800.01 && salario <= 1200.00) {
			salarioNovo = salario * 1.10;
			reajuste = salarioNovo - salario;
			percentual = 10;
		}

		else if (salario >= 1200.01 && salario <= 2000.00) {
			salarioNovo = salario * 1.07;
			reajuste = salarioNovo - salario;
			percentual = 7;
		}

		else {
			salarioNovo = salario * 1.04;
			reajuste = salarioNovo - salario;
			percentual = 4;
		}

		System.out.printf("Novo salario: %.2f\n", salarioNovo);
		System.out.printf("Reajuste ganho: %.2f\n", reajuste);
		System.out.println("Em percentual: " + percentual + " %");

		input.close();

	}
}
