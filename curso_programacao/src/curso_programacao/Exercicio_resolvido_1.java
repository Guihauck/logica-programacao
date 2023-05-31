package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_resolvido_1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double largura;
		double comprimento;
		double area;
		double preco;
		double metroQuadrado;

		System.out.printf("Por favor digite o valor de largura do seu imóvel: ");

		largura = sc.nextDouble();

		System.out.printf("%nAgora digite o comprimento do seu imóvel: ");

		comprimento = sc.nextDouble();

		System.out.printf("%nPor fim digite por favor o metro quadrado do imóvel: ");

		metroQuadrado = sc.nextDouble();

		area = largura * comprimento;
		preco = area * metroQuadrado;

		System.out.printf("Obrigado por informar os dados, calculando...%n%n");
		System.out.printf("A area do seu imóvel é: %.1f", area);
		System.out.printf("O preço do seu imóvel é: %.2f", preco);
		
		sc.close();

	}

}
