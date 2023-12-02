
import java.util.Scanner;
public class Matrizes {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Tamanho: ");
		int tam = input.nextInt();
		System.out.println();
		
		int[][] matriz = new int[tam][tam];
		
		//preenche a matriz
		for(int lin = 0; lin < matriz.length; lin++){
			for(int col = 0; col < matriz[lin].length; col++){
				System.out.printf("%d/%d - Digite: ",lin,col);
				matriz[lin][col] = input.nextInt();
			}
		}
		System.out.println();
		
		//imprimi a matriz
		for(int lin = 0; lin < tam; lin++){
			for(int col = 0; col < tam; col++){
				System.out.print(matriz[lin][col]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//numeros da diagonal principal
		System.out.println("Numeros da diagonal principal: ");
		for(int lin = 0; lin < tam; lin++){
			System.out.print(matriz[lin][lin]+" ");
		}
		System.out.println();
		
		//verifica os numeros negativos
		int negativos = 0;
		for(int lin = 0; lin < tam; lin++){
			for(int col = 0; col < tam; col++){
				if(matriz[lin][col] < 0){
					negativos++;
				}
			}
		}
		System.out.println();
		System.out.println("Quantidade de negativos: "+negativos);
		
		input.close();
	}
}