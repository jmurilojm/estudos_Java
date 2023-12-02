package proj015;

import java.util.Scanner;

public class MediaDosPares {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantidade? ");
		int total = input.nextInt();
		
		int[] numeros = new int[total];
		
		for(int x = 0; x < total; x++){
			System.out.print("> ");
			int numero = input.nextInt();
			numeros[x] = numero;
		}
		
		int soma = 0;
		int totalDePares = 0;
		for(int x = 0; x < total; x++){
			if(numeros[x] % 2 == 0){
				soma += numeros[x];
				totalDePares++;
			}
		}
		
		if(totalDePares > 0){
			double media = soma / totalDePares;
			System.out.println("Media dos pares: " + media);
		}else{
			System.out.println("Nenhum par foi digitado.");
		}
		
		input.close();
	}
}