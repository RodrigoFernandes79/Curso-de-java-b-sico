package aula02;

import java.util.Scanner;

public class SwitchExercicio {

	public static void main(String[] args) {
		/*EXERC�CIO:
		 * Escreva um programa que:
		 * receba um n�mero entre 1 a 12;
		 * Mostre o m�s na tela;
		 * Ex: 1-Janeiro;
		 * se o valor nao estiver entre 1 e 12 deve mostra uma mensagem de erro:
		 * Utilize o Scanner;
		 */
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero inteiro:");
		int n1 = teclado.nextInt();
		switch (n1) {
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Mar�o");
			break;
		case 4:
			System.out.println("Abril");
		case 5:
			System.out.println("Maio");/* e por a� vai ate o case 12 que � 
			*Dezembro
			*/
			break;
		default:
			System.out.println("Erro, Tente novamente");
			break;
		}
		
		
				
				
		}
		
	
	}

	

	
		
	