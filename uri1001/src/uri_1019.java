import java.util.Scanner;

public class uri_1019 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int N = input.nextInt();
		int horas;
		int minutos;
		int segundos;
		int resto;

		horas = N / 3600;
		resto = N % 3600;
		minutos = resto / 60;
		segundos = resto % 60;
		
		System.out.println(horas + ":" + minutos + ":" + segundos);

	}

}