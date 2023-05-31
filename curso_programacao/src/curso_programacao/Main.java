package curso_programacao;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		System.out.print("Olá Mundo!"); //Com somente print não realiza a quebra de linha.//
		System.out.println("Boa tarde!"); // Com println realiza a quebra de linha.//
		
		int y = 32; //Declaração de variável 'y' recebendo o valor de 32, número inteiro//
		double x = 10.35784; //Declaração de variável de um número tipo flutuante (decimal).//
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n",x); //Com printF é a abreviação de 'Formatado', imprimir formatado e para delimitar duas 
		//casas decimais realizar a escrita %.2f e %n é a quebra de linha//
		Locale.setDefault(Locale.US); //Para considerar o marcador de decimal em pontos, conforme nos EUA.//
		System.out.printf("%.2f%n",x); //Mediante a função Locale é possível agora printar o separador de decimal em ponto.//
		System.out.println("Guilherme " + "Percorreu " + x + " Metros de distância!");//Concatenação poderá ser utilizada com símbolo de '+'.//
		System.out.printf("Elias, tirou nota %.1f%n", x);//Para textos será possível realizar a formatação com os '%.1f' e quebra de linha com '%n'.//
		
		String nome = "Guilherme Hauck";
		int idade = 24;
		double renda = 3200.85;
		System.out.printf("%s tem %d anos e recebe um salário de R$ %.2f de rendimentos mensais.%n",nome,idade,renda);
		// Os marcadores que foram usado são: %f = ponto flutuante, %d=inteiro,%s=texto e %n=quebra de linha.//
	}
	
}
