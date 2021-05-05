package laçosderepetições;

import java.util.Scanner;

public class RepetiçãoForExercicio01 {

	public static void main(String[] args) {
		/*Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X,
		 *  um valor por linha, inclusive o X, se for o caso.
		 */

		Scanner tecla = new Scanner(System.in);
		System.out.println("Digite um número de 1 a 100: ");
		int x =tecla.nextInt();
		
		if (x>=1&&x<=1000) {
		for (int i =1; i<=x ;i++) {
			if (i%2==1) {
				System.out.println(i);
			}else {
			
			
		}
			
	}

}
	}
}
