package proj017;

import java.util.Scanner;

public class Aprovados {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantidade de alunos: ");
		int total = input.nextInt();
		
		String[] alunos = new String[total];
		double[] nota1 = new double[total];
		double[] nota2 = new double[total];
		
		for(int x = 0; x < total; x++){
			System.out.print(x + 1 + "⁰ aluno: ");
			alunos[x] = input.next();
			System.out.print("1ª nota: ");
			nota1[x] = input.nextDouble();
			System.out.print("2ª nota: ");
			nota2[x] = input.nextDouble();
		}
		
		System.out.println("Alunos aprovados:");
		for(int x = 0; x < total; x++){
			double media = (nota1[x] + nota2[x]) / 2;
			if(media >= 6.0){
				System.out.println(alunos[x]);
			}
		}
		
		
		input.close();
	}
}