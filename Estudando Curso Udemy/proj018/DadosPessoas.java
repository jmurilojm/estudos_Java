package proj018;

import java.util.Scanner;

public class DadosPessoas {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantidade de pessoas: ");
		int total = input.nextInt();
		
		double[] alturas = new double[total];
		char[] generos = new char[total];
		
		for(int x = 0; x < total; x++){
			System.out.print("Altura da " + (x + 1) + "ª pessoa: ");
			alturas[x] = input.nextDouble();
			System.out.print("Gênero: ");
			generos[x] = input.next().charAt(0);
		}
		
		double menor = alturas[0];
		double maior = 0.0;
		double somaAlturaF = 0.0;
		int quantidadeMulheres = 0;
		int quantidadeHomens = 0;
		
		for(int x = 0; x < total; x++){
			if(alturas[x] < menor){
				menor = alturas[x];
			}
			if(alturas[x] > maior){
				maior = alturas[x];
			}
			if(generos[x] == 'f'){
				somaAlturaF += alturas[x];
				quantidadeMulheres++;
			}
			if(generos[x] == 'm'){
				quantidadeHomens++;
			}
		}
		
		double media = somaAlturaF / quantidadeMulheres;
		
		System.out.println("Menor altura: " + menor);
		System.out.println("Maior: " + maior);
		System.out.println("Media das alturas das mulheres: " + media);
		System.out.println("Numero de homens: " + quantidadeHomens);
		
		input.close();
	}
}