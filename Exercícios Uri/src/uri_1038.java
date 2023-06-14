import java.util.Locale;
import java.util.Scanner;

public class uri_1038 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);

		int codPedido = input.nextInt();
		int quantidade = input.nextInt();
		double cachorroQuente = 4.00;
		double xSalada = 4.50;
		double xBacon = 5.00;
		double torradaSimples = 2.00;
		double refrigerante = 1.50;
		double preco;

		if(codPedido == 1) {
			preco = quantidade * cachorroQuente;
			System.out.printf("Total: R$ %.2f%n", preco);
		}
		if(codPedido == 2) { 
			preco = quantidade * xSalada;
			System.out.printf("Total: R$ %.2f%n", preco);
		}
		if(codPedido == 3) {
			preco = quantidade * xBacon;
			System.out.printf("Total: R$ %.2f%n", preco);
		}
		if(codPedido == 4) {
			preco = quantidade * torradaSimples;
			System.out.printf("Total: R$ %.2f%n", preco);
		}
		if(codPedido == 5) {
			preco = quantidade * refrigerante;
			System.out.printf("Total: R$ %.2f%n", preco);
		}
		input.close();
	}
}
