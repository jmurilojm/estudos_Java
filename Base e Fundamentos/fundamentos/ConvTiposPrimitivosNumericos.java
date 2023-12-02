package fundamentos;

public class ConvTiposPrimitivosNumericos {
	
	public static void main(String[] args) {
		
		float f = 1.5F;
  float fl = (float) 1.5; //CAST
  System.out.println(f);
  System.out.println(fl);
  
  int i = 5;
  byte b = (byte) i; //CAST
  System.out.println(i);
  System.out.println(b);
  
  double d = 123.4;
  int in = (int) d;
  System.out.println(d);
  System.out.println(in);
		
	}
}