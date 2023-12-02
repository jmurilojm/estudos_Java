import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();

		
		//your code goes here
		
		for(int x = 0;x<3;x++){
		    amount -= amount * 0.1;
		}
		 
		System.out.println((int)amount);
		
	}
}