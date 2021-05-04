package primeiroprograma;
/* 1)Altere seu programa para imprimir uma mensagem diferente;
 * 2)Altere seu programa para imprimir duas linhas de texto 
 * usando duas linhas de codigo System.out;
 * 3)Sabendo que os caracteres\n representam uma quebra
 * de linhas, imprima duas linhas de texto usando uma única 
 * linha de código System.out.
 */
public class ExercicioHelloWord {
	public static void main(String[] args) {
		/*System.out.println("Hello World!");//Resposta 1
		System.out.println("The World is Mine");//Resposta 2
		System.out.println("Hello World!"+ "\n" +"The World is Mine");
		/*Resposta 3 => pode ser também:
		 * System.out.println("Hello World! \nThe World is Mine");
		 */
		System.out.println("OS QUATRO PILARES DA ORIENTAÇÃO A OBJETOS");
		System.out.println("Encapsulamento\nHerança\nPoliformismo\nAbstração");
		System.out.println("Encapsulamento - É a capacidade do objeto juntar tudo"
				+ "em uma coisa só , em geral acaba por ocultar os detalhes de "
				+ "implementação expondo só o que deve ser acessado publicamente");
		System.out.println("Herança - É a capacidade de um objeto ser idealizado"
				+ "por outro objeto");
		System.out.println("Poliformismo - É a capacidade de um objeto se passar"
				+ "por outro");
	}

}
