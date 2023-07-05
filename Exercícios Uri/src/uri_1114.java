import java.util.Scanner;

public class uri_1114 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int digiteSenha = input.nextInt();
		int senhaCorreta = 2002;

		while (digiteSenha != senhaCorreta) {
			System.out.println("Senha Invalida");
			digiteSenha = input.nextInt();
		}

		System.out.println("Acesso Permitido");
		digiteSenha = input.nextInt();

		input.close();

	}
}
