package classes;

public class AreaCirc {
	
	double raio;
	static final double PI = 3.14159;
	
	AreaCirc(double raioInicial){
		raio = raioInicial;
	}
	
	public double area(){
		return PI*raio*raio;
	}
	
	static double area(double areaInicial){
		return PI*areaInicial*areaInicial;
	}
}