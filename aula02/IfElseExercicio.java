package aula02;

import java.util.Scanner;

public class IfElseExercicio {

	public static void main(String[] args) {
		/*EXERCÍCIO:
		 * 1)Escreva um programa que receba um número e informe se o
		 * mesmo é par ou impar;
		 * 2)Escreva um programa que receba um numero e informe se o
		 * mesmo é positivo ou negativo.
		 */
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número inteiro:");
		int n1 = teclado.nextInt();
		if(n1%2==0) {
			System.out.printf("O número %d é par!\n",n1);
		}else {
			System.out.printf("O número %d é ímpar!\n",n1);
		}
	
		System.out.println("Digite outro numero inteiro positivo ou negativo:");
		int n2 = teclado.nextInt();
		if (n2<0) {
			System.out.printf("O número %d é negativo!\n", n2);
		}else if(n2==0){
			System.out.printf("O número %d é NEUTRO!\n", n2);
		}else {
			System.out.printf("O número % é POSITIVO\n", n2);
		}
		}
		
	}


