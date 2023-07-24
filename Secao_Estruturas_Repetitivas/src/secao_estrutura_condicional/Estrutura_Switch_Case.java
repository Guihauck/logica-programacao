package secao_estrutura_condicional;

import java.util.Scanner;

public class Estrutura_Switch_Case {

	public static void main(String[] args) {

		Scanner escrevaDiaSemana = new Scanner(System.in);
		String dia;

		int escreva = escrevaDiaSemana.nextInt();

		switch (escreva) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "Segunda-feira";
			break;
		case 3:
			dia = "Terça-feira";
			break;
		case 4:
			dia = "Quarta-feira";
			break;
		case 5:
			dia = "Quinta-feira";
			break;
		case 6:
			dia = "Sexta-feira";
			break;
		default:
			dia = "Valor inválido!";
			break;
		}
		
		System.out.println("DIA DA SEMANA É: " + dia);

		escrevaDiaSemana.close();

	}

}
