package aula01;

public class VariaveisPrimitivasExercicio {
/* Na empresa onde trabalhamos, h� tabelas com o quanto foi gasto em cada m�s.Para 
 * fechar o balan�o do primeiro trimestre, precisamos somar o gasto total. Sabendo 
 * que, em janeiro,foram gastos 15.000,00 Reais, em fevereiro 23.000,00 Reais e 
 * em mar�o 17.000,00 Reais, fa�a um programa que calcule e imprima o gasto 
 * total no trimestre.Siga esses passos:
 * 1)Crie uma classe chamada Balan�oTrimestral com um bloco main;
 * 2) Dentro do main, declare uma vari�vel inteira chamada gastosJaneiro e inici-
 * alize -a com 15.000,00 Reais;
 * 3) Crie tamb�m as vari�veis gastosFevereiro e gastosMar�oe inicialize - as com
 * os seus respectivos valores;
 * 4) Crie uma vari�vel chamada gastosTrimestre e inicalize a com a soma das 
 * outras 3 variaveis;
 * 5)imprima a variavel gastosTrimestre;
 * 6) Calcule a media mensal e imprima na tela.
 */
	public static void main(String[] args) {
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMar�o = 17000;
		
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMar�o;
		System.out.println("Os gastos do Trimestre foram: R$ " + gastosTrimestre);
		double mediaMensal = gastosTrimestre/3;
		System.out.format("A m�dia de gastos foi de:R$ %.2f", mediaMensal);
		
		
		

	}

}
