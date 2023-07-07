import java.util.Scanner;

public class uri_1134 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int categoria = 0, alcool = 0, gasolina = 0, diesel = 0;

		while (categoria != 4) {
			categoria = input.nextInt();

			while (categoria < 1 || categoria > 4) {
				categoria = input.nextInt();
			}
			switch (categoria) {
			case 1:
				alcool++;
				break;
			case 2:
				gasolina++;
				break;
			case 3:
				diesel++;
				break;
			}

		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		input.close();

	}
}
