import java.util.ArrayList;

public class Program
{
    public static void main(String[] args) {
        
        Conta c1= new Conta();
        Conta c2= new Conta();
        
        c1.titular = "Cicrano de Tal";
        c1.numero = "288-7";
        c1.saldo = 5000;
        
        c2.titular= "Fulano de Sobrenome";
        c2.numero= "249-1";
        c2.saldo= 600;
        
        c1.saldo();
        c2.saldo();
        
        c1.sacar(500);
        c1.sacar(5000);
        c1.sacar(250);
        c1.depositar(25);
        
        c1.tranferir(500,c2);
        
        c1.extrato();
        c2.extrato();
        
    }
}


class Conta {
    public String titular;
    public String numero;
    public double saldo;
    ArrayList<String> historico;
    
    public Conta(){
        historico = new ArrayList<>();
	}
    
    
    public void saldo(){
        System.out.println("SALDO: ");
        System.out.println("Nome: "+this.titular);
        System.out.println("Conta: "+this.numero);
        System.out.println("Saldo: "+this.saldo+"\n");
	}
    
    public void infor(){
        System.out.println("Nome: "+this.titular);
        System.out.println("Conta: "+this.numero);
        System.out.println("Saldo: "+this.saldo+"\n");
	}
    
    public void depositar(double valorDeposito){
        this.saldo += valorDeposito;
            historico.add("Deposito R$ "+valorDeposito);
            System.out.println("Deposito de R$ "+valorDeposito+" realizado!\n");
            this.saldo();
	}
    
    public void sacar(double valorSaque){
        if(valorSaque <= this.saldo){
            this.saldo -= valorSaque;
            historico.add("Saque: R$ "+valorSaque);
            System.out.println("Saque realizado!\n");
            this.saldo();
        }
        else{
            System.out.println("Saldo para saque, insuficiente!\n");
            this.saldo();
        }
	}
    public void tranferir(double valorTransferencia,Conta conta){
        if(valorTransferencia <= this.saldo){
            this.saldo -= valorTransferencia;
            conta.saldo += valorTransferencia;
            historico.add("Transferencia: "+valorTransferencia+" > "+conta.titular+" "+conta.numero);
            System.out.println("Transferencia realizada com sucesso!\n");
            this.saldo();
            conta.saldo();
        }
        else{
            System.out.println("Saldo para tranferencia, insuficiente!\n");
            this.saldo();
        }
	}
    public void extrato(){
        System.out.println("EXTRATO - CONTA:");
        this.infor();
        for(String historia : historico){
            System.out.println(historia);
        }
        System.out.println();
	}
	
}