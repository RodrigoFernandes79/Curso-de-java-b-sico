package laçosderepetição;

import java.util.Scanner;

public class WhileExercicio01 {
	


	public static void main(String[] args) {
		/*Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de 
		 * senha incorreta informada, escrever a mensagem "Senha Inválida".Apos 3 tentativas 
		 * erradas, imprima na tela "Senha Bloqueada". Quando a senha for informada correta
		 * mente deve ser impressa a mensagem "Acesso Permitido e o algoritmo encerrado. 
		 * Considere que a senha 
		 * correta é o valor 2002:
		 */
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite 04 numeros da sua senha:");
		int senha = teclado.nextInt();
		int cc=1;
		while (senha != 2002&&cc<3) {
			cc++;
			System.out.println("SENHA INVÁLIDA");
			System.out.println("Erro! Digite novamente a sua senha de 4 digitos:");
			senha = teclado.nextInt();	
		}if (cc==3&&senha!=2002) {
			System.out.println("SENHA BLOQUEADA!");
	}else {
		System.out.println("ACESSO PERMITIDO");

	}
}
}