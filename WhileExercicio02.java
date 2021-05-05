package laçosderepetição;

import java.util.Scanner;

public class WhileExercicio02 {

	public static void main(String[] args) {
		/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
		 * cartesiano. Para cada ponto , escrever o quadrante a que ele pertence. O algoritmo será encerrado
		 * quando pelo menos uma de suas coordenadas for NULA(nesta situação nao escrever mensagem alguma):
		 */
		Scanner teclado = new Scanner(System.in);
		int  x, y;
		System.out.println("Digite a coordenada X:");
		x = teclado.nextInt();
		System.out.println("Digite a coordenada Y:");
		y = teclado.nextInt();
		
		while (x!=0 && y!=0) {
			if(x>0&&y>0) {
			System.out.println("Primeiro Quadrante");
		}else if(x>0&&y<0) {
			System.out.println("Segundo Quadrante");
		}else if(x<0&&y<0) {
			System.out.println("Terceiro Quadrante");
		}else if(x<0&&y>0) {
			System.out.println("Quarto Quadrante");
		}
			System.out.println("Digite a coordenada X:");
			x = teclado.nextInt();
			System.out.println("Digite a coordenada Y:");
			y = teclado.nextInt();	
		}
		
		
		
		
		teclado.close();
	}

}
