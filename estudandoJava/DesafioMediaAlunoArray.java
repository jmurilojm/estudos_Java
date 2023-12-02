package desafios;

import java.util.Scanner;
import java.util.Arrays;

public class DesafioMediaAlunoArray {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Total de notas: ");
		int totalNotas = teclado.nextInt();
		
		double[] notas = new double[totalNotas];
		
		
		System.out.println("\nDigite as notas no aluno: ");
		
		for(int i = 0;i < totalNotas;i++){
			System.out.printf("Nota "+(i+1)+": ");
			notas[i] = teclado.nextDouble();
		}
		
		//Verificar as notas no Array
		System.out.println(Arrays.toString(notas));
		
		double media = 0;
		/*
		for(int i = 0; i < notas.length; i++){
			media += notas[i];
		}
		*/
		
		for(double nota : notas){
			media += nota;
		}
		
		System.out.printf("\nMedia das %d notas do aluno = %.1f",totalNotas,(media/totalNotas));
		
		teclado.close();
		
	}
}