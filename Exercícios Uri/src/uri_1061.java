import java.util.Scanner;

public class uri_1061 {
	
	public static void main(String[] args) {

		Scanner escreva = new Scanner(System.in);
		
		String dataInicial[] = escreva.nextLine().split(" ");
		String horarioInicial[] = escreva.nextLine().replaceAll(" ", "").split(":");
		String dataFinal[] = escreva.nextLine().split(" ");
		String horarioFinal[] = escreva.nextLine().replaceAll(" ", "").split(":");
		int segundosDia = 86400;
		int valorMinutoSegundos = 60;
		int horaSegundos = 3600;
		
		// conversao de string para int para os dados de data inicial
		
		int dataInicial1 = Integer.parseInt(dataInicial[1]); // convertendo string para valor inteiro [1] para pegar o segundo caracter.
		int horarioInicial1 = Integer.parseInt(horarioInicial[0]);
		int minutoInicial = Integer.parseInt(horarioInicial[1]);
		int segundoInicial = Integer.parseInt(horarioInicial[2]);
		
		//data final
		
		int dataFinal2 = Integer.parseInt(dataFinal[1]); 
		int horarioFinal2 = Integer.parseInt(horarioFinal[0]);
		int minutoFinal2 = Integer.parseInt(horarioFinal[1]);
		int segundoFinal2 = Integer.parseInt(horarioFinal[2]);
		
		// criacao de variáveis para conversão de valores inteiros em segundos para facilitar o calculo
		
		int q1,q2,tempo;
		
		q1 = segundoInicial + minutoInicial * valorMinutoSegundos + horarioInicial1 * horaSegundos + dataInicial1 * segundosDia;
		q2 = segundoFinal2 + minutoFinal2 * valorMinutoSegundos + horarioFinal2 * horaSegundos + dataFinal2 * segundosDia;
		tempo = q2 - q1;
		
		System.out.printf("%d dia(s)\n",tempo/segundosDia);
		tempo = tempo % segundosDia;
		System.out.printf("%d hora(s)\n",tempo/horaSegundos);
		tempo = tempo % horaSegundos;
		System.out.printf("%d minuto(s)\n",tempo/valorMinutoSegundos);
		tempo = tempo % valorMinutoSegundos;
		System.out.printf("%d segundo(s)\n",tempo);
		
		escreva.close();
	}
}
