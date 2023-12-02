package fundamentos;

public class ConvNumeroString {
	
	public static void main(String[] args) {
		
		Integer n = 1000;
  System.out.println(n.toString());
  System.out.println(n.toString().length());
  
  int i = 500;
  System.out.println(Integer.toString(i));
  System.out.println(Integer.toString(i).length());
  System.out.println("" + i);
  System.out.println(("" + i).length());
  
  /*
  Byte.toString();
  Short.toString();
  Long.toString();
  Float.toString();
  */
	
	}
}