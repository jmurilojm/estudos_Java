package proj013;

import java.util.Scanner;

public class MaiorPosicao {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantidade? ");
		int total = input.nextInt();
		
		double[] valores = new double[total];
		
		for(int x = 0; x < total; x++){
			System.out.print(x + 1 + "/" + total + " > ");
			double numero = input.nextDouble();
			valores[x] = numero;
		}
			
		double maior = 0.0;
		int posicao = 0;
		for(int x = 0; x < total; x++){
			if(valores[x] > maior){
				maior = valores[x];
				posicao = x;
			}
		}
		
		System.out.println("Maior valor: " + maior);
		System.out.println("Posição do maior valor: " + posicao);
		
		input.close();
	}
}