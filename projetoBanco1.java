import java.util.Random;

public class Program
{
    public static void main(String[] args) {

		// INSTÂNCIAS
        Conta conta1 = new Conta();
        conta1.nome = "Fulano de Sobrenome";
        conta1.saldo = 1000;
        
        Conta conta2 = new Conta();
        conta2.nome = "Cicrano do apelido";
        conta2.saldo = 1000;
        
        // INTEREÇÃO ENTRE AS INSTÂNCIAS
        conta1.infor();// INnformações com o método criado.
        conta2.infor();// INnformações com o método criado.
        
        conta1.sacar(230);// Sacando...
        conta2.depositar(785);// Depositando...
        
        System.out.println(conta1);// Informações com a sobrescrita do toString.
        System.out.println(conta2);// Informações com a sobrescrita do toString.
        
        conta2.tranferir(250, conta1);// Tranferindo...

        System.out.println(conta1);
        conta2.infor();
    }
    
}
// CLASSE PESSOA
class Pessoa{
    String nome;
}
// CLASSE CONTA - HERDANDO A CLASSE PESSOA

class Conta extends Pessoa{
    
    private final int numero;
    double saldo;
    // CONSTRUTOR SEM PARÂMETROS
    Conta(){
        // O código gerado será o número da conta instanciada.
        Random codigo = new Random();
        numero = codigo.hashCode();
    }
    // MÉTODOS
    // REALIZA SAQUES
    void sacar(double valor){
        if(valor <= this.saldo){
            this.saldo -= valor;
        }
        else{
            System.out.println("Saldo Insuficiente!\n");
        }
    }
    // REALIZA DEPÓSITOS
    void depositar(double valor){
        this.saldo += valor;
    }
    // REALIZA TRANFERÊNCIAS
    void tranferir(double valor,Conta conta){
        if(valor <= this.saldo){
            this.saldo -= valor;
            conta.saldo += valor;
        }
        else{
            System.out.println("Saldo Insuficiente!\n");
        }
    }
    // INFORMAÇÃO SOBRE AS INSTÂNCIAS
    void infor(){
        System.out.println("Titular: "+nome.toUpperCase());
        System.out.println("Conta: "+numero);
        System.out.printf("Saldo: R$ %.2f",saldo);
        System.out.println("\n");
    }
    // SOBRESCREVENDO O MÉTODO TOSTRING
    @Override
    public String toString(){
        return String.format("Titular: "+nome.toUpperCase()
                +"\nConta: "+numero+"\nSaldo: R$ %.2f\n",saldo);
    }
}