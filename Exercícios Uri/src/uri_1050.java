import java.util.Scanner;

public class uri_1050 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numeroDDD = input.nextInt();
		
		if (numeroDDD == 61) {
			System.out.println("Brasilia");
		}
		else if (numeroDDD == 71) {
			System.out.println("Salvador");
		}
		else if (numeroDDD == 11) {
			System.out.println("Sao Paulo");
		}
		else if (numeroDDD == 21) {
			System.out.println("Rio de Janeiro");
		}
		else if (numeroDDD == 32) {
			System.out.println("Juiz de Fora");
		}
		else if (numeroDDD == 19) {
			System.out.println("Campinas");
		}
		else if (numeroDDD == 27) {
			System.out.println("Vitoria");
		}
		else if (numeroDDD == 31) {
			System.out.println("Belo Horizonte");
		}
		else {
			System.out.println("DDD nao cadastrado");
		}
		
		input.close();
		
	}
	
}
