package aula02;

import java.util.Scanner;

public class IfElseExercicio {

	public static void main(String[] args) {
		/*EXERC�CIO:
		 * 1)Escreva um programa que receba um n�mero e informe se o
		 * mesmo � par ou impar;
		 * 2)Escreva um programa que receba um numero e informe se o
		 * mesmo � positivo ou negativo.
		 */
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro:");
		int n1 = teclado.nextInt();
		if(n1%2==0) {
			System.out.printf("O n�mero %d � par!\n",n1);
		}else {
			System.out.printf("O n�mero %d � �mpar!\n",n1);
		}
	
		System.out.println("Digite outro numero inteiro positivo ou negativo:");
		int n2 = teclado.nextInt();
		if (n2<0) {
			System.out.printf("O n�mero %d � negativo!\n", n2);
		}else if(n2==0){
			System.out.printf("O n�mero %d � NEUTRO!\n", n2);
		}else {
			System.out.printf("O n�mero % � POSITIVO\n", n2);
		}
		}
		
	}


