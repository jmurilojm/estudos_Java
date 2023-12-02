package proj010;

import java.util.Scanner;

public class Pares {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantidade de elementos: ");
		int total = input.nextInt();
		
		int[] numeros = new int[total];
		int totalPares = 0;
		int[] pares = new int[total];
		
		for(int x = 0; x < numeros.length; x++){
			System.out.print(x + 1 + "/" + total + " > ");
			numeros[x] = input.nextInt();
			if(numeros[x] % 2 == 0){
				/*
				Verifica quem é par e a variável
				totalPares recebe +1, depois
				adiciona este mesmo número
				ao vetor dos pares.
				*/
				totalPares++;
				pares[x] = numeros[x];
			}
		}
		
		System.out.println("NÚMEROS PARES:");
		for(int x = 0; x < numeros.length; x++){
			if(numeros[x] % 2 == 0){
				System.out.print(numeros[x] + " ");
			}
		}
		
		System.out.println("\nQUANTIDADE DE PARES = " + totalPares);
		
		
		input.close();
	}
}