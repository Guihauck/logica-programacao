import java.util.Scanner;

public class uri_1115 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		
		while (((x=input.nextInt())!=0)&&((y=input.nextInt())!=0)) {
			
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			else if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
			else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			else {
				System.out.println("quarto");
			}
		}
		
		input.close();
		
	}

}
