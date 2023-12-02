package classes;

import classes.AreaCirc;

public class AreaCircTeste {
	
	public static void main(String[] args) {
		
		AreaCirc a = new AreaCirc(3);
		
		System.out.println(a.area());
		
		//a.pi = 3;
		
		System.out.println(a.area());
		System.out.println(AreaCirc.PI);
		System.out.println(AreaCirc.area(3));
		
	}
}