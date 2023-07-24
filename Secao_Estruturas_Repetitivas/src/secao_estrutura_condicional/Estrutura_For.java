package secao_estrutura_condicional;

import java.util.Scanner;

public class Estrutura_For {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int numberInput = input.nextInt();
		int soma = 0;

		for (int i = 0; i < numberInput; i++) {
			int x = input.nextInt();
			soma += x;

		}

		System.out.println(soma);

		input.close();

	}

}
