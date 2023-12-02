package proj007;

import java.util.Scanner;
import classes.Banco;

public class App {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Account number: ");
		int number = input.nextInt();
		System.out.print("Name: ");
		String name = input.next();
		System.out.print("Deposito inicial: ");
		double depositoInicial = input.nextDouble();
		
		Banco c1 = new Banco(number,name,depositoInicial);
		
		System.out.print("Depositar: ");
		double valorDeposito = input.nextDouble();
		c1.depositar(valorDeposito);
		
		System.out.print("Sacar: ");
		double valorSaque = input.nextDouble();
		c1.sacar(valorSaque);
		
		input.close();
	}
}