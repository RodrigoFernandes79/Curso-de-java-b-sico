package la�osderepeti��es;

import java.util.Scanner;

public class Repeti�aoFor {

	public static void main(String[] args) {
		/*o "for � usado geralmente quando sabemos o n�mero de repeti��es a serem utilizadas.
		 * Ex: Fa�a um programa que l� um valor inteiro N e depois de N n�meros inteiros .Ao final, mostra 
		 *  a soma dos N n�meros lidos. 
		 */
		Scanner tecla = new Scanner(System.in);
		System.out.println("Digite a quantidade de repeti��es desejada:");
		int soma = 0;
		int N = tecla.nextInt();
		for (int i=0;i<N; i++) {
			System.out.println("Digite um n�mero inteiro:");
			int X = tecla.nextInt();
			soma =soma +X;
		}System.out.println("A soma entre os n�meros s�o: " +soma);
		
	}

}
