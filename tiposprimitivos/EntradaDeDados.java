package tiposprimitivos;

import java.util.Scanner;

public class EntradaDeDados {
/*Entrada de dados � usado para receber informa��es do teclado.
 * Ocorre quando pedimos ao usuario para digitar alguma informa
 * ��o e o programa vai guardar essa informa��o.
 */
	public static void main(String[] args) {
		/*Para entrada de dados utilizamos a classe Scanner para 
		 * criar um ob
		 * jeto chamado teclado
		 */
		 Scanner teclado = new Scanner(System.in); 
		 /* Agora iremos ler o nome a ser atribu�do:
		  * "String nome = teclado.nextline();"
		  * float nota = teclado.nextfloat();"
		  * Para dar mais interatividade, podemos mostrar mensagens na tela,
		  * usando sa�da de dados:
		  */
		System.out.println("Digite o seu nome:");
		String nome = teclado.nextLine(); //Insere dados do nome
		System.out.println("Digite sua nota:");
		float nota = teclado.nextFloat(); //Insere dados da nota
		/* Por fim  ap�s inserir dados do nome e da nota, iremos mostrar na tela
		 * os dados(sa�da de dados):
		 */
		System.out.format("A nota de %s � %.2f ", nome, nota);
	
		
		


	}

}
