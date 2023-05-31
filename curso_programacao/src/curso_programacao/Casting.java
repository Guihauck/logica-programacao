package curso_programacao;

public class Casting {

	// Valor inteiro para resultado double.//
	public static void main(String[] args) {
		int a,c;
		double resultado;
		
		a = 4;
		c = 3;
		
		resultado = (double) a / c; //(double) casting: conversão implicita dos valores.//
		System.out.println(resultado);
		
		// Valor double para resultado inteiro.//
		
		double j;
		int o;
		
		j = 5.5545;
		o = (int)j; //double para int//
		
		System.out.println(o);
		
	}

}
