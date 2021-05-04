package tiposprimitivos;

public class IncompatibilidadesEntreNumerosStrings {
	/* Se por acaso eu quisesse que uma determinada String recebesse um valor 
	 * inteiro e fizesse por esse metodo:
	 * "int idade =30;"
	 * "String valor = idade;"
	 * Nesse caso ir� dar erro , pois h� incompatibilidade entre uma String
	 * e um numero.
	 * Tamb�m ir� dar erro se feito desta maneira:
	 * "String valor = (String) idade;" -> at� porque String n�o � uma Typecast
	 * e sim uma Classe Involucro(Wrapper Class).
	 */

	public static void main(String[] args) {
		//O m�todo correto �:
		int idade = 30;
		String valor = Integer.toString(idade);  
		 /* Estou convertendo a Classe inv�lucro(Wrapper Class) Integer
		 * para a classe String(toString) da vari�vel idade. 
		 */
		System.out.println(valor); //ir� mostrar na tela o valor "30".
		 /* O Contr�rio tamb�m ocorre. Convertendo de String para n�mero inteiro:
		*/
		String valor1 = "30"; 
		int idade1 = Integer.parseInt(valor1);//parseInt converte para inteiro.
		System.out.println(idade1);
		// convertendo String em float:
		String valor2 = "30.5";
		float salario = Float.parseFloat(valor2);//usa WrapperClass Float.
		System.out.format("%.2f\n", salario);

		
		// Convertendo float em String:
		float salario1 =(float) 30.5;
		String valor3 = Float.toString(salario1); /*Sempre que for converter para
		*String usa "toString".
		*/
		System.out.printf(valor3);
		
		
	}

}
