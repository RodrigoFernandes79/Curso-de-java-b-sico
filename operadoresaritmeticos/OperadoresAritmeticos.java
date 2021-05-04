package operadoresaritmeticos;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 3;
		double media = (n1+n2)/2;
		System.out.println("A m�dia �: "+ media);
		/* Usei os parenteses , pois sem os parenteses o calculo � feito com 
		 * prioridade na divis�o.
		 * primeiro, o calculo � feito na *,/ e % depois calcula + e -.
		 */
		
		//VALORES UN�RIOS:
		//s�o opera��es que acrescentam ou subtraem um valor numerico. Ex:
		int numero = 5;
		numero ++; // o mais mais acrescenta mais um valor a variavel
		System.out.println(numero); // O resultado � 6.
		int number = 6;
		number --; // O menos menos subtrai um valor a menos � variavel number
		System.out.println(number);//O resultado � 5.
		
		//PR� INCREMENTO E PR� DECREMENTO:
		/* Quando a opera��o ++ ou -- vem ap�s uma operac�o aritmetica ou vem 
		 * antes , faz toda a diferen�a:
		 */
		 int numero1 = 5;
		 int d = 5 + numero1++;
		 System.out.println(d); /* o resultado soma 5 com o valor numero1 que � 
		 5 , faz a soma que � 10, e depois o numero1 acrescenta mais um .
		 System.out.println(numero1);
		/* Para o resultado ser a soma de 5 com o valor de numero1 j�
		 *  acrescentado,� preciso colocar ++ antes do numero1:
		 */
		 int numero2 = 5;
		 int d1 = 5 + ++numero2;// vai ocorrer a soma do 5 com o 5+1 que fica 11.
		 System.out.println(d1);
		 System.out.println(numero2);
		 // o mesmo ocorre com o --.
		 
		 // ARREDONDAMENTOS USANDO CLASSE MATH:
		 //floor , ceil e round:
		 double v = 8.3;
		 int ar =(int) Math.floor(v); // floor vai arrendondar para baixo.
		 System.out.println(ar);
		 
		 double a = 8.3;
		 int ar1 = (int)Math.ceil(a); // ceil arredonta pra cima.
		 System.out.println(ar1);
		 
		 double b = 8.3;
		 int ar2 = (int)Math.round(b);// round arredonda automaticamente
		 System.out.println(ar2);
		  
		 //GERAR NUMEROS ALEAT�RIOS:
		 double aleatory = Math.random(); /* random sempre vai gerar n�meros
		 *aleatorios entre 0 e 1. 
		 */
		 System.out.println(aleatory);
		 /* Se caso for pegar dois n�meros inteiros aleatorios, seria da seguinte
		  * forma:
		  */
		 double aleatory1 = Math.random();
		 int num = (int) (5 + aleatory1 * (10-5)); //randomizo um numero de 5 a 10
		 System.out.println(num);
	}

}
