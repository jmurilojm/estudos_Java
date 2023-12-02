package fundamentos;

public class Wappers {
	
	public static void main(String[] args) {
		
		Byte b = 10;
  Short s = 100;
  Integer i = 1000;
  Long l = 10000L;
  Float f = 123.4F;
  Double d = 12345.6789;
  Character c = 'M';
  Boolean boo = Boolean.parseBoolean("true");
  
  //Byte
  System.out.println(b.byteValue());
  
  //Short
  System.out.println(s.toString());
  
  //Integer
  System.out.println(i*3);
  String conv = i.toString(); //Int para String
  Integer.parseInt(conv); //String para Int
  System.out.println(conv);
  
  //Long
  System.out.println(l / 3);
  
  //Float
  System.out.println(f);
  
  //Double
  System.out.println(d);
  
  //Character
  c.toString();
  System.out.println(c);
  
  //Boolean
  System.out.println(boo);
		
	}
}