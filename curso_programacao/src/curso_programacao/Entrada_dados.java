package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Entrada_dados {

	public static void main(String[] args) {
		
		// ------------------------ ENTRA DE TEXTOS ------------------------ //
		//Scanner sc = new Scanner(System.in); //Objeto tipo Scanner (Associando o objeto Scanner ao teclado no modo console por meio do
		// Scanner(System.in) //
		//String x; // Criação de variável //
		//x = sc.next(); //Variável x recebendo o sc.next. Permitindo que o usuário digite uma palavra e seja armazenada dentro de x, comando de entrada de dados.
		//System.out.println("Você digitou: "+ x);
		
		//sc.close(); // Função que vai desalocar o recurso do recurso que foi criado (encerra o recurso).//
		
		// ------------------------ Entrada de números inteiros// ------------------------
		
		//Scanner sp = new Scanner(System.in);
		//int y;
		//y = sp.nextInt();
		//System.out.println("Você digitou o número inteiro: " + y);
		
		//sp.close();
		
		//------------------------ Entra de números de ponto flutuante ------------------------
		
		//Locale.setDefault(Locale.US);
		//Scanner sc = new Scanner(System.in);
		//double x;
		//x = sc.nextDouble();
		//System.out.println("Você digitou o número decimal: "+ x);
		
		//------------------------ Entra de dados caracter ------------------------
		
		//Scanner sc = new Scanner(System.in);
		//char x;
		//x = sc.next().charAt(0); //Sc.next: Vai ler o que digitar na forma de string; charAt0: pega o primeiro caracter da string.
		//System.out.println("Você digitou: " + x);
		
		//------------------------ Ler vários dados na mesma linha ------------------------
		//Scanner sc = new Scanner(System.in);
		
		//String a;
		//int w;
		//double c;
		
		//a = sc.next();
		//w = sc.nextInt();
		//c = sc.nextDouble();
		
		//System.out.println("Seus dados cadastrais digitados são:");
		//System.out.println(a);
		//System.out.println(w);
		//System.out.println(c);
		
		// ------------------------ Calculadora ------------------------ //
		
		//Locale.setDefault(Locale.US);
		//Scanner sc = new Scanner(System.in);
		//double valor1;
		//double valor2;
		//double valor3;
		//double resultado;
		
		//valor1 = sc.nextDouble();
		//valor2 = sc.nextDouble();
		//valor3 = sc.nextDouble();
		
		//resultado = valor1 * valor2 * valor3;
		
		//System.out.println("O resultado do seu cálculo de multiplicação é:");
		//System.out.print(resultado);
		
		// ------------------------ NextLine (Leitura da linha inteira) ------------------------ //
		
		Scanner sc = new Scanner(System.in);
		
		String textos,textox,textoy;
		
		textos = sc.nextLine();
		textox = sc.nextLine();
		textoy = sc.nextLine();
		
		System.out.println("Os seus dados digitados foram:");
		System.out.println(textos);
		System.out.println(textox);
		System.out.println(textoy);
		
	}

}
