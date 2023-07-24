package secao_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Resolvido_01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner escrevaNota = new Scanner(System.in);
		
		double notaPrimeiroSemestre = escrevaNota.nextDouble();
		double notaSegundoSemestre = escrevaNota.nextDouble(); 
		double notaFinal = notaPrimeiroSemestre + notaSegundoSemestre;
		
		if (notaFinal > 60.00) {
			System.out.println("NOTA FINAL = " + notaFinal);
		}
		else {
			System.out.println("NOTA FINAL = " + notaFinal);
			System.out.println("REPROVADO");
		}

		escrevaNota.close();
	}
}
