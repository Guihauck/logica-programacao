package secao_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo_operadores_atribuicao_acumulativa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner escrevaMinutos = new Scanner(System.in);
		
		double minutosLigacao = escrevaMinutos.nextDouble();
		double limiteFranquia = 100;
		double fatura = 50.0;
		
		if (minutosLigacao > limiteFranquia) {
			fatura += (minutosLigacao - limiteFranquia) *2.0;
		}
		
		System.out.printf("Valor a pagar: %.2f%n", fatura);
		
		escrevaMinutos.close();

	}

}
