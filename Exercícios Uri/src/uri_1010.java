import java.util.Locale;
import java.util.Scanner;

public class uri_1010 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);

		int codPeca1 = input.nextInt();
		int numUnidadePeca1 = input.nextInt();
		double valorUnitarioPeca1 = input.nextDouble();
		int codPeca2 = input.nextInt();
		int numUnidadePeca2 = input.nextInt();
		double valorUnitarioPeca2 = input.nextDouble();
		double totalPeca1;
		double totalPeca2;
		double valorPagamento;

		if (codPeca1 == 12 || codPeca2 == 16 || codPeca1 == 13 || codPeca2 == 161 || codPeca1 == 1 || codPeca2 == 2) {

			totalPeca1 = numUnidadePeca1 * valorUnitarioPeca1;
			totalPeca2 = numUnidadePeca2 * valorUnitarioPeca2;
			valorPagamento = totalPeca1 + totalPeca2;
			System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorPagamento);

		} else {
			totalPeca1 = numUnidadePeca1 * valorUnitarioPeca1;
			totalPeca2 = numUnidadePeca2 * valorUnitarioPeca2;
			valorPagamento = totalPeca1 + totalPeca2;
			System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorPagamento);
			;
		}

		input.close();

	}
}
