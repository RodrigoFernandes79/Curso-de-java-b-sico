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
		
		
		
		System.out.println("olá");
		System.out.printf("Seu nome é %s\nO teu cpf é %s\nA tua idade é %d\nTua"
				+ " altura é %.2f e o sexo é %s \n", nome, cpf, idade,altura, sexo);
		
		System.out.println("Digite o primeiro número:");
		double numero1 = teclado.nextInt();
		System.out.println("Ok...Digite o segundo número: ");
		double numero2 = teclado.nextInt();
		double divisão = (numero1/numero2);
		System.out.println("A soma entre" +numero1+ "e" +numero2+ "é:" +(numero1+ numero2));
		System.out.println("A diferença entre" +numero1+ "e" +numero2+ "é" +(numero1+numero2));
		System.out.println(numero1+ "vezes" +numero2+ "é:" +(numero1*numero2));
		System.out.printf(numero1+ "dividido por " +numero2+ "é %.2f",divisão);
		

	}

}
