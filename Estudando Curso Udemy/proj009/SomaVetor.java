package proj009;

import java.util.Scanner;

public class SomaVetor {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Total de elementos: ");
		int total = input.nextInt();
		
		double[] numeros = new double[total];
		
		for(int x = 0; x < total; x++){
			System.out.print(x + 1 + "/" + total + " > ");
			numeros[x] = input.nextDouble();
		}
		
		double soma = 0.0;
		System.out.print("VALORES = ");
		for(int x = 0; x < numeros.length; x++){
			System.out.print(numeros[x] + " ");
			soma += numeros[x];
		}
		
		System.out.println("\nSOMA = " + soma);
		System.out.println("MÉDIA = " + String.format("%.2f",soma / numeros.length));
		
		
		input.close();
	}
}