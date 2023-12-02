package proj006;

import java.util.Scanner;
import classes.Conversor;

public class App {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double cotacao = input.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double value = input.nextDouble();
		
		System.out.println(Conversor.realDolar(cotacao,value));
		
		System.out.print("Digite a largura: ");
		int largura = input.nextInt();
		System.out.print("Altura: ");
		int altura = input.nextInt();
		
		System.out.println(Conversor.cmPx(largura,altura));
		
		input.close();
	}
}