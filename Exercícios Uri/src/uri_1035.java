import java.util.Scanner;

public class uri_1035 {

	public static void main(String[] args) {

		Scanner escrevaNumero = new Scanner(System.in);

		int A = escrevaNumero.nextInt();
		int B = escrevaNumero.nextInt();
		int C = escrevaNumero.nextInt();
		int D = escrevaNumero.nextInt();

		int somaCD = C + D;
		int somaAB = A + B;
		int verificaParA = A % 2;

		if (B > C && D > A && somaCD > somaAB && C > 0 && D > 0 && verificaParA == 0) {
			System.out.println("Valores aceitos");
		} else {
			System.out.println("Valores nao aceitos");
		}

		escrevaNumero.close();
	}
}
