package proj003;

import classes.Retangulo;

public class App {
	
	public static void main(String[] args) {
		
		Retangulo r1;
		
		r1 = new Retangulo();
		r1.width = 3.;
		r1.height = 4.;
		
		double a = r1.area();
		double p = r1.perimeter();
		double d = r1.diagonal();
		
		System.out.println(a);
		System.out.println(p);
		System.out.println(d);
		
		System.out.println(r1);
		
	}
}