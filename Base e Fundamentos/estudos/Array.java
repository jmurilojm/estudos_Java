package sejaBemVindo;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
		
//ARRAY - LISTA
		
//de STRING
		String[] nomes = {"Murilo","Jessica"};
		//					0		1 <-indices
		
		//Visualizar Elemento
		System.out.println(nomes[1]);
		//Visualizar Quantidade
		System.out.println(nomes.length);
		
//de NUMEROS
		int[] numeros = {15,30,45};
		
		//Visualizar Elemento
		System.out.println(numeros[2]);
		//Visualizar Quantidade
		System.out.println(numeros.length);
		
//MANIPULACAO
		//Troca Elemento
		nomes[0] = "Teste";
		System.out.println(nomes[0]);
		System.out.println(Arrays.toString(nomes));
		System.out.println(Arrays.toString(numeros));
		
		System.out.println();
		
//MATRIZ
		
		int matriz[][] = new int[3][3];
		
		for (int lin = 0; lin < matriz.length; lin++) {
			for (int col = 0; col < matriz[lin].length; col++) {
				System.out.print(matriz[lin][col]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Preenchendo Matriz
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.print("Linhas: ");
		int l = teclado.nextInt();
		
		System.out.print("Colunas: ");
		int c = teclado.nextInt();
		
		System.out.println();
		
		int matrix[][] = new int[l][c];
		
		for (int lin = 0; lin < matrix.length; lin++) {
			for (int col = 0; col < matrix[lin].length; col++) {
				System.out.print(matrix[lin][col]);
			}
			System.out.println();
		}
		
		teclado.close();
		
	}
}