package aula01;

public class CastingEPromo��o {
	/* Existem algumas incompatibilidades ao tentar fazer uma atribui��o 
	 * direta. Por exemplo um n�mero real representado em uma variavel
	 * do tipo double, ao tentar atribuir o valor double em uma variavel
	 * do tipo int(inteiro) , n�o funciona, pois nao especifica se o valor
	 * � do tipo inteiro ou n�o.
	 */

	public static void main(String[] args) {
		/* double d = 3.1415;
		 * int = d; => n�o compila ou 
		 * int = 3,14; => tamb�m nao compila
		 * "double d = 5;
		 * int i = d;"  => nem mesmo quando declaro que double � um n�mero 
		 * inteiro (5), ao atribuir o mesmo valor ao int i, ele nao compila,
		 * pois nao especifica o tipo primitivo do valor.
		 * O mesmo n�o ocorre ao contr�rio:
		 */
		int i = 5;
		double d = i;/* Neste caso a variavel "d" recebeu o valor i,
		*pois double recebe todos os numeros, inclusive numeros inteiros.
		*/
		System.out.println(d);
		/* para que possamos atribuir alguns valores entre alguns tipos primitivos 
		 * diferentes, usamos o processo CASTING ou Typecast:
		 */
		double d1 = 3.14;
		int i1 = (int)d1;// declarei apenas a parte inteira de d1 que � 3.
		System.out.println(i1);
		
		//O mesmo ocorre com long e int:
		long x = 1000;
		int i2 = (int) x;// tem que informar o tipo primitivo do valor x
		System.out.println(i2);
		 /* Ao usar o double a declara��o do valor deve ser apenas o numero,
		  * por�m com o float deve se colocar o numero segudo do "f":
		  */
		float y = 3.8f; 
		System.out.println(y);
		// ou pode usar typecast(CASTING)
		float z = (float) 3.8;
		System.out.println(z);
		
		float f = 5; // quando � um inteiro n�o precisa colocar o "f"
		System.out.println(f);
		
		double u = 5;
		float b = 3;
		float q = b + (float)u;
		System.out.println(q);
		
		

	}

}
