import java.util.Scanner;

public class uri_1047 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int H1 = input.nextInt();
		int M1 = input.nextInt();
		int H2 = input.nextInt();
		int M2 = input.nextInt();
		int HM1 = (H1 * 60) + M1;
		int HM2 = (H2 * 60) + M2;
		int H24 = 24 * 60;
		int resultado = 0;

		if (HM2 > HM1) {
			resultado = HM2 - HM1;
			System.out.println("O JOGO DUROU " + (resultado / 60) + " HORA(S) E " + (resultado % 60) + " MINUTO(S)");
		} else if (HM1 > HM2) {
			resultado = (H24 - HM1) + HM2;
			System.out.println("O JOGO DUROU " + (resultado / 60) + " HORA(S) E " + (resultado % 60) + " MINUTO(S)");
		} else {
			System.out.println("O JOGO DUROU " + 24 + " HORA(S) E " + 0 + " MINUTO(S)");
			input.close();
		}

	}
}
