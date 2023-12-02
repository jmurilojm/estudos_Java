
public class Strings {
	
	public static void main(String[] args) {
		
			// Algumas coisa com String.
		String nome = "Monteiro Paraiba";
		
		String f1 = nome.toUpperCase();
		System.out.println(f1);
		String f2 = nome.toLowerCase();
		System.out.println(f2);
		String f3 = nome.trim();
		System.out.println(f3);
		String f4 = nome.substring(2);
		System.out.println(f4);
		String f5 = nome.substring(2,4);
		System.out.println(f5);
		String f6 = nome.replace("i","í");
		System.out.println(f6);
		String f7 = nome.replace("Paraiba","PB");
		System.out.println(f7);
		int a = nome.indexOf("P");
		System.out.println(a);
		int b = nome.lastIndexOf("a");
		System.out.println(b);
		String[] v = nome.split(" ");
		System.out.println(v[1]);
		
	}
}