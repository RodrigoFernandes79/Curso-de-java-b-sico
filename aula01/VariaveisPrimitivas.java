package aula01;

public class VariaveisPrimitivas {

	public static void main(String[] args) {
		int idade = 15; // idade recebe quinze.
		System.out.println(idade);//imprime na tela o valor 15.
		/*Como alterar ou definir uma segunda vari�vel a partir da variavel
		 * idade: 
		 */
		int idadeNoAnoQueVem = idade +1;
		System.out.println(idadeNoAnoQueVem);
		/* OPERADORES ARITM�TICOS:
		 * + - / *s�o operadores comuns e existe o % que mostra o resto da divis�o
		 */
		int quatro = 2+2;
		System.out.println(quatro);
		int tres = 5-2;
		System.out.println(tres);
		int oito = 4*2;
		System.out.println(oito);
		int desesseis =64/4;
		System.out.println(desesseis);
		int um = 5%2; // o operador % pega o resto da divis�o inteira.
		System.out.println(um);
		// Em casos de numeros reais, o tipo primitivo utilizado � o double:
		double pi = 3.14;
		System.out.println(pi); // armazena n�meros fracionais
		double x = 5*10;
		System.out.println(x);  // tamb�m armazena n�meros inteiros.
		/* O tipo primitivo boolean armazena um valor verdadeiro ou falso, e s�:
		 * n�o armazena n�meros, palavras ou endere�os:
		 */
		boolean casado = true;
		System.out.println(casado);
		int idade1 = 30;
		boolean menorDeIdade = idade1<18; /*usei o tipo boolean para
		* retomar um valor l�gico(true ou false). idade � 30 e 30 N�O � menor
		* que 18. Ent�o o resultado � false.
		*/
		System.out.println(menorDeIdade);
		/* O tipo primitivo "char" guarda um , e apenas um caractere e deve ser
		 * declarado entre aspas simples ''.Ex:
		 */
		char letra = 'A'; // apenas um caracteres dentro de aspas simples.
		System.out.println(letra);
		
		
		
		
		
		
		
		
		
		
		

	}

}
