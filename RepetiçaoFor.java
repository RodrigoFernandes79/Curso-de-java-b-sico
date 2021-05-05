package laçosderepetições;

import java.util.Scanner;

public class RepetiçaoFor {

	public static void main(String[] args) {
		/*o "for é usado geralmente quando sabemos o número de repetições a serem utilizadas.
		 * Ex: Faça um programa que lê um valor inteiro N e depois de N números inteiros .Ao final, mostra 
		 *  a soma dos N números lidos. 
		 */
		Scanner tecla = new Scanner(System.in);
		System.out.println("Digite a quantidade de repetições desejada:");
		int soma = 0;
		int N = tecla.nextInt();
		for (int i=0;i<N; i++) {
			System.out.println("Digite um número inteiro:");
			int X = tecla.nextInt();
			soma =soma +X;
		}System.out.println("A soma entre os números são: " +soma);
		
	}

}
