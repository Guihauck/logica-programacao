import java.util.Locale;
import java.util.Scanner;

public class uri_1045 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		double A, B, C, total, BC, A2;

		A = input.nextDouble();
		B = input.nextDouble();
		C = input.nextDouble();

		if (B > A) {
			total = A;
			A = B;
			B = total;
		}

		if (C > A) {
			total = A;
			A = C;
			C = total;
		}

		A2 = Math.pow(A, 2);
		BC = Math.pow(B, 2) + Math.pow(C, 2);

		if (A >= B + C) {
			System.out.println("NAO FORMA TRIANGULO");
		}

		else if (A2 > BC) {
			System.out.println("TRIANGULO OBTUSANGULO");
		}

		else if (A2 < BC) {
			System.out.println("TRIANGULO ACUTANGULO");
		}

		else {
			System.out.println("TRIANGULO RETANGULO");
		}

		if (A == B && B == C) {
			System.out.println("TRIANGULO EQUILATERO");
		}
		
		else if (A == B || A == C || B == C) {
			System.out.println("TRIANGULO ISOSCELES");
		}
		input.close();
		

	}
}
