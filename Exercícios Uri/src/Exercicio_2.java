import java.util.Locale;
import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		String nome1;
		int idade1;
		String nome2;
		int idade2;
		double mediaIdade;

		System.out.println("Digite um nome e idade:");
		nome1 = sc.next();
		idade1 = sc.nextInt();
		System.out.println("Digite novamente um nome e idade:");
		nome2 = sc.next();
		idade2 = sc.nextInt();

		mediaIdade = (double) (idade1 + idade2) / 2;

		System.out.printf("A idade média entre %s e %s é de %.1f anos.", nome1, nome2, mediaIdade);

	}

}