package sejaBemVindo;

public class OpLogicos {
	
	public static void main(String[] args) {
		
		//OPERADORES LOGICOS
		// && e ||ou
		
		//p ^ q = V
		if (10==10 && 10<20){
			System.out.println("Verdade!");
		} else {
			System.out.println("Falso!");
		}
		
		//~p ^ q = F
		if (10==100 && 10<20){
			System.out.println("Verdade!");
		} else {
			System.out.println("Falso!");
		}
		
		//~p v q = V
		if (10==100 || 10<20){
			System.out.println("Verdade!");
		} else {
			System.out.println("Falso!");
		}
		
		//~p v ~q = F
		if (10==100 || 100<20){
			System.out.println("Verdade!");
		} else {
			System.out.println("Falso!");
		}
		
	}
}