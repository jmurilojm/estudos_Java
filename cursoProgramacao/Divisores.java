
public class Divisores {
	
	public static void main(String[] args) {
		
		int num = 50;
		int cont = 0;
		
		for(int x = 0; x <= 50; x++){
			if(x % 50 == 0){
				cont++;
			}
		}
		
		System.out.println(cont);
		
	}
}