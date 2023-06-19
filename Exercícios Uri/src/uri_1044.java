import java.util.Locale;
import java.util.Scanner;

public class uri_1044 {
	
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int valorA = input.nextInt();
		int valorB = input.nextInt();
		 
		
		if(valorA%valorB == 0 || valorB%valorA == 0) {
			System.out.println("Sao Multiplos");
		}
		
		else {
			System.out.println("Nao sao Multiplos");
		}
		
		input.close();
		
	}

}