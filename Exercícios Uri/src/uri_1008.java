import java.util.Locale;
import java.util.Scanner;
public class uri_1008 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);

	    int numeroFuncionario = input.nextInt();
	    int horasTrabalho = input.nextInt();
	    double salarioHorasTrabalhadas = input.nextDouble();
	    double salarioAjustado;

	    if (numeroFuncionario == 25) {
	      salarioAjustado =  horasTrabalho * salarioHorasTrabalhadas;
	      System.out.println("NUMBER = " + numeroFuncionario);
	      System.out.printf("SALARY = U$ %.2f%n", salarioAjustado);
	    }
	    else if (numeroFuncionario == 1) {
	      salarioAjustado = horasTrabalho * salarioHorasTrabalhadas;
	      System.out.println("NUMBER = " + numeroFuncionario);
	      System.out.printf("SALARY = U$ %.2f%n", salarioAjustado);
	    }
	    else if (numeroFuncionario == 6) {
	      salarioAjustado = horasTrabalho * salarioHorasTrabalhadas;
	      System.out.println("NUMBER = " + numeroFuncionario);
	      System.out.printf("SALARY = U$ %.2f%n", salarioAjustado);
	    }
	    else {
	      salarioAjustado = horasTrabalho * salarioHorasTrabalhadas;
	      System.out.println("NUMBER = " + numeroFuncionario);
	      System.out.printf("SALARY = U$ %.2f%n", salarioAjustado);
	    }
	    
	    input.close();
		
	}
}
