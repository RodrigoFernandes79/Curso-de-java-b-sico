package aula01;

import java.util.Scanner;

public class ExercicioVariaveisCadastro {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o seu nome:");
		String nome = teclado.nextLine();
		System.out.println("Digite seu CPF:");
		String cpf = teclado.nextLine();
		System.out.println("Digite o sexo: M para masculino e F para feminino");
		String sexo = teclado.nextLine();
		System.out.println("Digite sua idade:");
		int idade = teclado.nextInt();
		System.out.println("Digite a sua altura");
		double altura = teclado.nextDouble();
		
		
		
		System.out.println("ol�");
		System.out.printf("Seu nome � %s\nO teu cpf � %s\nA tua idade � %d\nTua"
				+ " altura � %.2f e o sexo � %s \n", nome, cpf, idade,altura, sexo);
		
		System.out.println("Digite o primeiro n�mero:");
		double numero1 = teclado.nextInt();
		System.out.println("Ok...Digite o segundo n�mero: ");
		double numero2 = teclado.nextInt();
		double divis�o = (numero1/numero2);
		System.out.println("A soma entre" +numero1+ "e" +numero2+ "�:" +(numero1+ numero2));
		System.out.println("A diferen�a entre" +numero1+ "e" +numero2+ "�" +(numero1+numero2));
		System.out.println(numero1+ "vezes" +numero2+ "�:" +(numero1*numero2));
		System.out.printf(numero1+ "dividido por " +numero2+ "� %.2f",divis�o);
		

	}

}
