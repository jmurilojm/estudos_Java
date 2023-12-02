package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Matriz {

  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   
   
   /*
	int[][] m = new int[25][50];
	
	//Tamanho da Matriz m
	for(int l=0; l < m.length; l++){
		//Tamanho da Matriz da Matriz m
		//Tamanho da Matriz da posicao [chave/indice]
		for(int c=0; c < m[l].length; c++){
			System.out.print(m[l][c]);
		}
		System.out.println();
	}
	*/
	
	
	System.out.print("Quantidade de alunos: ");
	int alunos = input.nextInt();
	
	System.out.print("Total de notas por aluno: ");
	int notas = input.nextInt();
	
	double[][] caderneta = new double[alunos][notas];
	//String[] nome = new String[alunos];
	
	double soma = 0;
	for(int a = 0; a < caderneta.length;a++){
		//System.out.print("\nNome do aluno: ");
		//nome[a] = input.next();
		
		for(int n = 0; n < caderneta[a].length;n++){
			System.out.printf("Nota %d: ",n+1);
			caderneta[a][n] = input.nextDouble();
			soma += caderneta[a][n];
		}
		System.out.println();
	}
	
	
	//Mostrar Matriz e seus elementos
	//System.out.println(Arrays.deepToString(caderneta));
	
	//Mostrar Matriz e seus elementos
	for(double[] mostrar : caderneta){
		System.out.println(Arrays.toString(mostrar));
	}

	System.out.println(soma);
	
	input.close();
   
  }
}
