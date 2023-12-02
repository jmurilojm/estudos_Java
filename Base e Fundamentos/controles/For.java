package controles;

public class For {
	
	public static void main(String[] args) {
		
		//DETERMINADO
		
		for (int cont=0;cont < 3; cont++) {
    System.out.println("Lopes Ferreira");
  }
  
  //FOR Semelhante a o While
  int x = 0;
  for (;x < 3;) {
    System.out.println("Murilo");
    x++;
  }
		
		//FOR in FOR
		
		for (int lin = 0; lin < 5; lin++){
			
	  	for (int col = 0; col < 4; col++){
				
				System.out.printf("[%d%d]",lin,col);
			}
			
	  	System.out.println();
		}
		
	}
}