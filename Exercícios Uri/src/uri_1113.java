import java.util.Scanner;

public class uri_1113 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int numeroX = input.nextInt();
		int numeroY = input.nextInt();

		while (numeroX != numeroY) {
			if (numeroX < numeroY) {
				System.out.println("Crescente");
			} else {
				System.out.println("Decrescente");

			}
			numeroX = input.nextInt();
			numeroY = input.nextInt();
		}

		input.close();

	}
}
