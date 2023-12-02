package proj001;

import classes.Quadrado;

public class App {
	
	public static void main(String[] args) {
		
		Quadrado q1,q2;
		
		q1 = new Quadrado();
		q2 = new Quadrado();
		
		q1.base = 3;
		q1.altura = 5;
		
		int areaQ = q1.area();
		
		System.out.println(areaQ);
		
	}
}