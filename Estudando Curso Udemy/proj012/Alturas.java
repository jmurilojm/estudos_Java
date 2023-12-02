package proj012;

import java.util.Scanner;
import classes.Pessoa;

public class Alturas {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantas pessoas? ");
		int total = input.nextInt();
		Pessoa[] pessoas = new Pessoa[total];
		
		for(int x = 0; x < total; x++){
			System.out.println();
			System.out.print("Nome: ");
			String nome = input.next();
			System.out.print("Idade: ");
			int idade = input.nextInt();
			System.out.print("Altura: ");
			double altura = input.nextDouble();
			
			pessoas[x] = new Pessoa(nome,idade,altura);
		}
		
		double somaAlturas = 0.0;
		for(int x = 0; x < total; x++){
			somaAlturas += pessoas[x].getAltura();
		}
		
		int menor = 0;
		for(int x = 0; x < total; x++){
			if(pessoas[x].getIdade() < 16){
				menor++;
			}
		}
		
		System.out.println("\nAltura média: " + somaAlturas/total);
		System.out.println("Pessoas com menos de 16 anos: " + menor * 100 / total + "%");
		
		for(int x = 0; x < total; x++){
			if(pessoas[x].getIdade() < 16){
				System.out.println("> " + pessoas[x].getName());
			}
		}
		
		input.close();
	}
}