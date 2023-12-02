package proj020;

import java.util.Scanner;

public class LocalizacaoNaMatriz {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numLin = 3;
		int numCol = 3;
		
		int[][] matriz = new int[numLin][numCol];
		
		//preenchimento da matriz
		for(int x = 0; x < matriz.length; x++){
			for(int y = 0; y < matriz[x].length; y++){
				System.out.print("> ");
				matriz[x][y] = input.nextInt();
			}
		}
		System.out.println();
		
		//impressao da matriz
		for(int x = 0; x < numLin; x++){
			for(int y = 0; y < numCol; y++){
				System.out.print(matriz[x][y]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		//usuario digita um numero desejado que esteja na matriz
		System.out.print("Qual número você deseja saber sua posição? ");
		int num = input.nextInt();
		//System.out.println(num);
		System.out.println();
		
		
		//localiza e mostra os números vizinhos
		for(int i=0; i<matriz.length; i++){ 
			for(int j=0; j<matriz[i].length; j++){
				if(matriz[i][j] == num){
					System.out.println("Position: Linha " + (i+1) + ", Coluna "+ (j+1) + ":");
					if(j > 0){
						System.out.println("Left: " + matriz[i][j-1]); 
					} 
					if(i > 0){
						System.out.println("Up: " + matriz[i-1][j]);
					}
					if(j < matriz[i].length-1){
						System.out.println("Right: " + matriz[i][j+1]);
					}
					if(i < matriz.length-1){
						System.out.println("Down: " + matriz[i+1][j]);
					}
				}
			}System.out.println();
		}
		
		
		input.close();
	}
}