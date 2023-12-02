package classes;

public class Conversor {
	
	static final double IOF = 6/100;
	static final int PX = 118;
	
	public static double realDolar(double cotacao,double valueDesejado){
		double custo = cotacao * valueDesejado;
		double taxaCalculadaIOF= custo * IOF;
		return custo + taxaCalculadaIOF;
	}
	public static String cmPx(int largura,int altura){
		int pxL = largura * PX;
		int pxA = altura * PX;
		return "Px de Largura: "+pxL+"\nPx de Altura: "+pxA;
	}
	
}