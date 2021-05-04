package aula01;

public class CastingEPromoção {
	/* Existem algumas incompatibilidades ao tentar fazer uma atribuição 
	 * direta. Por exemplo um número real representado em uma variavel
	 * do tipo double, ao tentar atribuir o valor double em uma variavel
	 * do tipo int(inteiro) , não funciona, pois nao especifica se o valor
	 * é do tipo inteiro ou não.
	 */

	public static void main(String[] args) {
		/* double d = 3.1415;
		 * int = d; => não compila ou 
		 * int = 3,14; => também nao compila
		 * "double d = 5;
		 * int i = d;"  => nem mesmo quando declaro que double é um número 
		 * inteiro (5), ao atribuir o mesmo valor ao int i, ele nao compila,
		 * pois nao especifica o tipo primitivo do valor.
		 * O mesmo não ocorre ao contrário:
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
		int i1 = (int)d1;// declarei apenas a parte inteira de d1 que é 3.
		System.out.println(i1);
		
		//O mesmo ocorre com long e int:
		long x = 1000;
		int i2 = (int) x;// tem que informar o tipo primitivo do valor x
		System.out.println(i2);
		 /* Ao usar o double a declaração do valor deve ser apenas o numero,
		  * porém com o float deve se colocar o numero segudo do "f":
		  */
		float y = 3.8f; 
		System.out.println(y);
		// ou pode usar typecast(CASTING)
		float z = (float) 3.8;
		System.out.println(z);
		
		float f = 5; // quando é um inteiro não precisa colocar o "f"
		System.out.println(f);
		
		double u = 5;
		float b = 3;
		float q = b + (float)u;
		System.out.println(q);
		
		

	}

}
