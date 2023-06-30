package secao_estrutura_condicional;

import java.util.Scanner;

public class Estruturas_repetitivas_enquanto {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int soma = 0;
		
		while (x != 0) {
			soma = soma + x;
			x = input.nextInt();
		}
		
		System.out.println("A soma dos valores dentro do intervalo digitado são: " + soma);
		
		input.close();
		
	}
}