package proj014;

import java.util.Scanner;

public class AbaixoDaMedia {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantidade? ");
		int total = input.nextInt();
		
		double[] notas = new double[total];
		
		double soma = 0.0;
		for(int x = 0; x < total; x++){
			System.out.print(x + 1 + "/" + total + " > ");
			double nota = input.nextDouble();
			notas[x] = nota;
			soma += nota;
		}
		
		double media = soma / total;
		System.out.println("Media do vetor = " + String.format("%.2f",media));
		
		System.out.println("Elementos abaixo da média: ");
		for(int x = 0; x < total; x++){
			if(notas[x] < media){
				System.out.println(notas[x]);
			}
		}
		
		input.close();
	}
}