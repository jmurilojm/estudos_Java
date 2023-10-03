/*
Com esse código será possivel fazer o calculo de Juros Compostos utilizando os seguintes valores:

Valor = valor a ser emprestado;
Meses = tempo de duração do empréstimo;
Taxa = juros que será cobrado, ao mês.
*/

public class Program
{
    public static void main(String[] args) {
        
        double valor = 100;
        int meses = 3;
        double taxaJurosAoMes = 0.1;
        double montante = valor;
        
        for(int x = 0;x < meses;x++){
            montante += montante * taxaJurosAoMes;
        }
        
        System.out.println((int)montante - valor);
        
    }
}