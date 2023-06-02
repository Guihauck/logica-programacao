import java.util.Locale;
import java.util.Scanner;

public class uri_1009 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		String nomeVendedor;
		double salarioFixo;
		double totalVendas;
		double percentualComissao = 0.15;

		nomeVendedor = sc.next();
		salarioFixo = sc.nextDouble();
		totalVendas = sc.nextDouble();

		double result = totalVendas * percentualComissao + salarioFixo;

		System.out.printf("TOTAL = %.2f%n", result);

		sc.close();

	}

}
