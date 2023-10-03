public class Program
{
    public static void main(String[] args) {
        
        String texto = "Amor".toUpperCase();
        
        char[] fatiamento = texto.toCharArray();
        
        for(int x = fatiamento.length - 1;x >= 0;x--){
            System.out.print(fatiamento[x]);
        }

    }
}