import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		String text = scanner.nextLine();

		char[] arr = text.toCharArray();

		//your code goes here

        for(int x=arr.length-1;x>=0;x--){
            System.out.print(arr[x]);
        }
		
	}
}