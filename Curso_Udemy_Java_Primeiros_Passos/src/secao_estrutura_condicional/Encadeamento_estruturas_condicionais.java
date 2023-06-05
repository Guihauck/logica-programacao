package secao_estrutura_condicional;

import java.util.Scanner;

public class Encadeamento_estruturas_condicionais {

	public static void main(String[] args) {

		Scanner escrevaHorario = new Scanner(System.in);

		int horario = escrevaHorario.nextInt();

		if (horario < 12) {
			System.out.println("Bom dia!");

		} else if (horario < 18) {
			System.out.println("Boa tarde!");
		} else {
			System.out.println("Boa noite!");
		}
		escrevaHorario.close();
	}

}
