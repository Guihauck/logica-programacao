import java.util.Scanner;

public class uri_1078 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int inputNumber = input.nextInt();

		for (int i = 1; i <= 10; i++) {
			int resultMultiplication = i * inputNumber;

			System.out.println(i + " x " + inputNumber + " = " + resultMultiplication);

		}

		input.close();

	}

}