import java.util.Locale;
import java.util.Scanner;

public class uri_1020 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		int result = input.nextInt();
		int ano = 365;
		int mes = 30;

		int quantidadeAnos = result/ano;
		result = result % ano;
		
		int quantidadeMeses = result/mes;
		result = result % mes;
		
		int quantidadeDias = result;
		
		System.out.println(quantidadeAnos + " ano(s)");
		System.out.println(quantidadeMeses + " mes(es)");
		System.out.println(quantidadeDias + " dia(s)");
		
		input.close();
	}
}
