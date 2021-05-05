package laçosderepetição;

import java.util.Scanner;

public class WhileSoma {

	public static void main(String[] args) {
		/*Fazer um programa que lê números inteiros até que zero seja lido. Ao fina mostre a soma
		 * dos numeros lidos
		 */
		Scanner teclado = new Scanner(System.in);
		System.out.println("digite um numero:");
		int num = teclado.nextInt();
		int soma = 0;
		while (num != 0 ) {
			soma = soma +num;
			System.out.println("digite um número:");
			num = teclado.nextInt();
		
		}
		System.out.println(soma);

	}

}
