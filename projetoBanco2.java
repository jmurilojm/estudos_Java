public class Program
{
    public static void main(String[] args) {
		
        Conta conta1 = new Conta("Sicrano de Apelidado",2887,1500);
       Conta conta2 = new Conta("Beltrano Natalino do Norte",2491,2300);
       
       conta1.infor();
       conta2.infor();
       
       conta1.sacar(3000);
       conta1.tranferir(2800,conta2);
       
       conta1.depositar(125);
       conta2.depositar(230);
       
       conta1.infor();
       conta2.infor();
       
   }
 }

class Pessoa{
    private String nome;
    
    void setNome(String nome){
        this.nome = nome;
    }
    String getNome(){
        return nome;
    }
 }
 
class Conta extends Pessoa{
    private int numero;
    private double saldo;
    
    Pessoa titular;
    
    Conta(String nome,int numero,double saldo){
        this.setNome(nome);
        this.numero = numero;
        this.saldo = saldo;
    }
    int getNumero(){
        return numero;
    }
    double getSaldo(){
        return saldo;
    }
    void sacar(double valor){
        if(valor <= this.saldo){
            this.saldo -= valor;
        }
        else{
            System.out.println("Saldo para o Saque é insuficiente!\n");
        }
    }
    void depositar(double valor){
        this.saldo += valor;
    }
    void tranferir(double valor, Conta conta){
        if(valor <= this.saldo){
            this.saldo -= valor;
            conta.saldo += valor;
        }
        else{
            System.out.println("Saldo para a Tranferência é insuficiente!\n");
        }
    }
    void infor(){
        System.out.println("Titular: "+this.getNome());
        System.out.println("Numero: "+numero);
        System.out.printf("Saldo: %.2f\n",saldo);
        System.out.println();
    }
}


