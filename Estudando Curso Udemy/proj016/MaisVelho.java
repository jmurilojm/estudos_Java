package proj016;

import java.util.Scanner;
import classes.Pessoa;

public class MaisVelho {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantas pessoas? ");
		int total = input.nextInt();
		
		Pessoa[] pessoas = new Pessoa[total];
		
		for(int x = 0; x < total; x++){
			System.out.print("Nome: ");
			String nome = input.next();
			System.out.print("Idade: ");
			int idade = input.nextInt();
			
			pessoas[x] = new Pessoa(nome,idade);
		}
		
		int maior = 0;
		String nome = null;
		for(int x = 0; x < total; x++){
			/*
			Localiza qual é a pessoa mais
			velha pela idade e salva o
			nome junto.
			*/
			if(pessoas[x].getIdade() > maior){
				maior = pessoas[x].getIdade();
				nome = pessoas[x].getName();
			}
		}
		
		System.out.println("Nome: " + nome + "\nIdade: " + maior);
		
		input.close();
	}
}