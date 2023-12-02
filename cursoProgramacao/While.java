
import java.util.Scanner;

public class While {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
			// Encontrando o Quadrante.
		int x,y;
		
		System.out.print("X = ");
		x = input.nextInt();
		System.out.print("Y = ");
		y = input.nextInt();
		
		while(x != 0 && y != 0){
			if(x > 0 && y > 0){
				System.out.println("Q1");
			}
			else if(x < 0 && y > 0){
				System.out.println("Q2");
			}
			else if(x < 0 && y < 0){
				System.out.println("Q3");
			}
			else if(x > 0 && y < 0){
				System.out.println("Q4");
			}
			System.out.print("X = ");
			x = input.nextInt();
			System.out.print("Y = ");
			y = input.nextInt();
		}
		
		System.out.println("NULO");
		
		
		input.close();
	}
}