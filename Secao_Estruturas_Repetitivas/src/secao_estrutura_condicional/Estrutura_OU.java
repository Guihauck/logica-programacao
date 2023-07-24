package secao_estrutura_condicional;

import java.util.Scanner;

public class Estrutura_OU {
	public static void main(String[] args) {
		
		Scanner escrevaIdade = new Scanner(System.in);
		
		int idade = escrevaIdade.nextInt();
		String acompanhado = escrevaIdade.next();
		int idadePermissao = 18;
		
		if (idade >= idadePermissao || acompanhado.equals("sim")) {
			System.out.println("Jovem com acesso liberado!");
		}
		else {
			System.out.println("Jovem com o acesso não liberado!");
		}
		 
		escrevaIdade.close();
	}
}