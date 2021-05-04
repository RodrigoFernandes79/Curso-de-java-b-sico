package aula01;

public class VariaveisPrimitivas {

	public static void main(String[] args) {
		int idade = 15; // idade recebe quinze.
		System.out.println(idade);//imprime na tela o valor 15.
		/*Como alterar ou definir uma segunda variável a partir da variavel
		 * idade: 
		 */
		int idadeNoAnoQueVem = idade +1;
		System.out.println(idadeNoAnoQueVem);
		/* OPERADORES ARITMÉTICOS:
		 * + - / *são operadores comuns e existe o % que mostra o resto da divisão
		 */
		int quatro = 2+2;
		System.out.println(quatro);
		int tres = 5-2;
		System.out.println(tres);
		int oito = 4*2;
		System.out.println(oito);
		int desesseis =64/4;
		System.out.println(desesseis);
		int um = 5%2; // o operador % pega o resto da divisão inteira.
		System.out.println(um);
		// Em casos de numeros reais, o tipo primitivo utilizado é o double:
		double pi = 3.14;
		System.out.println(pi); // armazena números fracionais
		double x = 5*10;
		System.out.println(x);  // também armazena números inteiros.
		/* O tipo primitivo boolean armazena um valor verdadeiro ou falso, e só:
		 * não armazena números, palavras ou endereços:
		 */
		boolean casado = true;
		System.out.println(casado);
		int idade1 = 30;
		boolean menorDeIdade = idade1<18; /*usei o tipo boolean para
		* retomar um valor lógico(true ou false). idade é 30 e 30 NÃO é menor
		* que 18. Então o resultado é false.
		*/
		System.out.println(menorDeIdade);
		/* O tipo primitivo "char" guarda um , e apenas um caractere e deve ser
		 * declarado entre aspas simples ''.Ex:
		 */
		char letra = 'A'; // apenas um caracteres dentro de aspas simples.
		System.out.println(letra);
		
		
		
		
		
		
		
		
		
		
		

	}

}
