package classes;

public class Retangulo {
	
	public double width;
	public double height;
	
	public double area(){
		return width * height;
	}
	
	public double perimeter(){
		return (width + height) * 2;
	}
	
	public double diagonal(){
		double calculo = Math.pow(width,2) + Math.pow(height,2);
		double diagonal = Math.sqrt(calculo);
		return diagonal;
	}
	
	public String toString(){
		return "Área: "+area()+";\nPerimeter: "+perimeter()+";\nDiagonal: "+diagonal()+"\n";
	}
	
}