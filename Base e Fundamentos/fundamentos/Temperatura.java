package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		
		// (Fº - 32) * 5/9 = Cº

	double f = 50;
	final int NUM = 32;
	final double NUM2 = 5.0/9.0;
	double c = (f - NUM)*NUM2;
	
	System.out.println(c);
	
	f = 150;
	c = (f - NUM)*NUM2;
	System.out.println(c);
		
	}
}