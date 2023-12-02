package proj011;

import java.util.Scanner;

public class SomaMultVetores {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Quantos elementos? ");
		int total = input.nextInt();
		
		int[] vetorA = new int[total];
		int[] vetorB = new int[total];
		int[] vetorC = new int[total];
		
		System.out.println("Digite os valores de A: ");
		for(int x = 0; x < total; x++){
			System.out.print(x + 1 + "/" + total + " > ");
			vetorA[x] = input.nextInt();
		}
		System.out.println("Digite os valores B: ");
		for(int x = 0; x < total; x++){
			System.out.print(x + 1 + "/" + total + " > ");
			vetorB[x] = input.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE:");
		for(int x = 0; x < total; x++){
			int soma = vetorA[x] + vetorB[x];
			vetorC[x] = soma;
			System.out.println(vetorC[x]);
		}
		
		
		input.close();
	}
}