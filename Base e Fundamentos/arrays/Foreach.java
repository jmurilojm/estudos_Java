package arrays;

//import java.util.Arrays;

public class Foreach {
	
	public static void main(String[] args) {
		
		int[] n = new int[5];
		
		//Atribuindo valores ao Array
		//x[chave] = valor
		n[0] = 1;
		n[1] = 3;
		n[2] = 7;
		n[3] = 9;
		n[4] = 5;
		
		//Percorrendo com o Foreach
		for(int numeros : n){
			System.out.print(numeros+" ");
		}
		
		/*
		//Mostrando valor de uma chave
		System.out.println(n[3]);
		
		//Mostrando o Array e seus elementos
		System.out.println(Arrays.toString(n));
		
		//Percorrendo o Array
		for(int x = 0; x < n.length;x++){
			System.out.print(n[x]+" ");
		}
		*/
		
	}
}