package proj002;

import java.util.Scanner;
import classes.Produto;

public class App {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Produto p1;
		//p1 = new Produto();
		
		System.out.print("Product: ");
		String name = input.nextLine();
		System.out.print("Price: ");
		double price = input.nextDouble();
		System.out.print("Quantity: ");
		int quantity = input.nextInt();
		
		Produto p1 = new Produto(name,price,quantity);
		
		System.out.println(p1.getName()+", "+p1.getPrice()+", "+p1.getQuantity());
		System.out.println(p1);
		
		System.out.print("Adicionar: ");
		int quantParaAdcionar = input.nextInt();
		p1.addProduct(quantParaAdcionar);
		
		System.out.println(p1);
		
		System.out.print("Remover: ");
		int quantParaRemover = input.nextInt();
		p1.removeProduct(quantParaRemover);
		
		System.out.println(p1);
		
		input.close();
	}
}