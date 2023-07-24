import java.util.Scanner;

public class uri_1159 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int numeroInput;

		while ((numeroInput = input.nextInt()) != 0) {
			int soma = 0;

			for (int i = numeroInput, j = 1; j <= 5; i++) {

				if (i % 2 == 0) {

					soma += i++;
					j += 1;

				}

			}

			System.out.println(soma);
		}

		input.close();

	}

}
