import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		Random aleatorio = new Random();
		ArrayList<Integer> palpite = new ArrayList<>();
		
		while(palpite.size() < 6){
		    
		    int sorteado = aleatorio.nextInt(60);
		    
		    if(!palpite.contains(sorteado+1)){
		        palpite.add(sorteado+1);
		    }
		}
		
		
		Collections.sort(palpite);
		
		System.out.println(palpite);
		
		
	}
}