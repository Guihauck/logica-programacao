import java.util.Scanner;

public class uri_1049 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String animal1 = input.nextLine();
		String animal2 = input.nextLine();
		String animal3 = input.nextLine();
		
		if(animal1.equalsIgnoreCase("vertebrado")) {
			if(animal2.equalsIgnoreCase("ave")) {
				if(animal3.equalsIgnoreCase("carnivoro")) {
					System.out.println("aguia");
				}
			}
		}
		if (animal1.equalsIgnoreCase("vertebrado")) {
			if(animal2.equalsIgnoreCase("ave")) {
				if(animal3.equalsIgnoreCase("onivoro")) {
					System.out.println("pomba");
				}
			}
		}
		if(animal1.equalsIgnoreCase("vertebrado")) {
			if(animal2.equalsIgnoreCase("mamifero")) {
				if(animal3.equalsIgnoreCase("onivoro")) {
					System.out.println("homem");
				}
			}
		}
		if(animal1.equalsIgnoreCase("vertebrado")) {
			if(animal2.equalsIgnoreCase("mamifero")) {
				if(animal3.equalsIgnoreCase("herbivoro")) {
					System.out.println("vaca");
				}
			}
		}
		if(animal1.equalsIgnoreCase("invertebrado")) {
			if(animal2.equalsIgnoreCase("inseto")) {
				if(animal3.equalsIgnoreCase("hematofago")) {
					System.out.println("pulga");
				}
			}
		}
		if(animal1.equalsIgnoreCase("invertebrado")) {
			if(animal2.equalsIgnoreCase("inseto")) {
				if(animal3.equalsIgnoreCase("herbivoro")) {
					System.out.println("lagarta");
				}
			}
		}
		if(animal1.equalsIgnoreCase("invertebrado")) {
			if(animal2.equalsIgnoreCase("anelideo")) {
				if(animal3.equalsIgnoreCase("hematofago")) {
					System.out.println("sanguesseuga");
				}
			}
		}
		if(animal1.equalsIgnoreCase("invertebrado")) {
			if(animal2.equalsIgnoreCase("anelideo")) {
				if(animal3.equalsIgnoreCase("onivoro")) {
					System.out.println("minhoca");
				}
			}
		}
		input.close();
		
	}
}
