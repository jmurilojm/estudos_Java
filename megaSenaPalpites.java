/*
A cada vez que o programa for colocado em execução, você terá uma sequência de números para utilizá-los como palpite.

Na variável "totalPalpites", como o nome já diz, deverá mencionar quantos palpites deseja que sejam gerados.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Program
{
    public static void main(String[] args) {
        
        int totalPalpites = 5;
        
        Random aleatorio = new Random();
        ArrayList<Integer> palpite = new ArrayList<>();
        
        for(int x = 0; x < totalPalpites; x++){
            while(palpite.size() < 6){
        
                int sorteado = aleatorio.nextInt(60);
        
                if(!palpite.contains(sorteado+1)){
                    palpite.add(sorteado+1);
                }
            }
        
        
            Collections.sort(palpite);
        
            System.out.println(palpite);
            
            palpite.clear();
        }
        
    }
}