import java.util.Locale;
import java.util.Scanner;

public class uri_1041 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double eixoX = input.nextDouble();
		double eixoY = input.nextDouble();
		
		if (eixoX >0 && eixoY >0) {
			System.out.println("Q1");
		}
		else if (eixoX >0 && eixoY <0) {
			System.out.println("Q4");
		}
		else if (eixoX <0 && eixoY >0) {
			System.out.println("Q2");
		}
		else if (eixoX <0 && eixoY <0) {
			System.out.println("Q3");
		}
		else if (eixoX ==0 && eixoY ==0) {
			System.out.println("Origem");
		}
		else if (eixoY ==0) {
			System.out.println("Eixo X");
		}
		else {
			System.out.println("Eixo Y");
		}
		
		input.close();
		
	}
}
