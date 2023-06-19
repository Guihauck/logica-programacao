import java.util.Scanner;

public class uri_1046 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int horaInicio = input.nextInt();
		int horaTermino = input.nextInt();
		int duracao;
		int horaTotal = 24;
		
		if (horaTermino<=horaInicio) {
			duracao = (horaTotal + horaTermino) - horaInicio;
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		}
		
		else {
			duracao = horaTermino - horaInicio;
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		}
		
		input.close();
		
	}
}
