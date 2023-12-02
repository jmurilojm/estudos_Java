
public class Funcoes {
	
	public static void main(String[] args) {
		
		int a = 5;
		int b = 25;
		
			// Chamada de Fun com retorno.
		int soma = soma(a,b);
		System.out.println(soma);
		
			// Chamada de Fun sem retorno.
		area(a,b);
	}
	
	public static int soma(int x, int y){
		// A funcao retorna a soma de x e y.
		// Se retorna tem tipo.
		int calculo = x + y;
		return calculo;
	}
	
	public static void area(int x, int y){
		// A funcao aprenta o resultado da multiplicacao de x e y.
		// Se nao retorna é void (vazio).
		int calculo = x * y;
		System.out.println(calculo);
	}
	
}