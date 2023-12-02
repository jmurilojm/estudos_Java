
import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
			// Encontrando o Quadrante.
		int x,y;
		char resposta;
		
		do{
			System.out.print("X = ");
			x = input.nextInt();
			System.out.print("Y = ");
			y = input.nextInt();
			
			if(x == 0 || y == 0){
				System.out.println("NULO");
			}
			else if(x > 0 && y > 0){
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
			
			System.out.print("Fazer nova consuta? [s/n] ");
			resposta = input.next().charAt(0);
		}
		while(resposta != 'n');
		
		
		input.close();
	}
}