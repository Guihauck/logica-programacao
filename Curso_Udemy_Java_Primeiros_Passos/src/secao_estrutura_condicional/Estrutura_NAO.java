package secao_estrutura_condicional;

import java.util.Scanner;

public class Estrutura_NAO {
	
	public static void main(String[]args) {
		
		Scanner escreva = new Scanner(System.in);
		
		int valor1 = escreva.nextInt();
		int valor2 = escreva.nextInt();
		int valor3 = escreva.nextInt();
		int valor4 = escreva.nextInt();
		
		if (!(valor1 == valor2 && valor3 == valor4)) {
			System.out.println("Os valores são verdadeiros!");
		}
		
		else {
			System.out.println("Os valores são falsos!");
		}
		
		escreva.close();
	}
	
}
