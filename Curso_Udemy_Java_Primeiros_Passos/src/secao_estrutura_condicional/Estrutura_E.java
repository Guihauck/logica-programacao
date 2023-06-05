package secao_estrutura_condicional;

import java.util.Scanner;

public class Estrutura_E {

	public static void main(String[] args) {
		
		Scanner escreva = new Scanner(System.in);
		
		int valor1 = escreva.nextInt();
		int valor2 = escreva.nextInt();
		int valor3 = escreva.nextInt();
		int valor4 = escreva.nextInt();
		
		if (valor1 == valor2 && valor3 == valor4) {
			System.out.println("Valores de ambos os pares são iguais, condição verdadeira!");
		}
		else {
			System.out.println("Valores de ambos os pares não são iguais, condição falsa!");
		}
		
		escreva.close();
	}
	
}
