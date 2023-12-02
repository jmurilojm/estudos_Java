package proj008;

import java.util.Scanner;

public class Negativos {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Total de elementos: ");
		int total = input.nextInt();
		int[] numeros = new int[total];
		
		for(int x = 0; x < total; x++){
			System.out.print(x + 1 + "/" + total + " > ");
			numeros[x] = input.nextInt();
		}
		for(int x = 0; x < total; x++){
			if(numeros[x] < 0){
				System.out.println(numeros[x]);
			}
		}
		
		input.close();
	}
}