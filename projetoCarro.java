public class Program
{
    public static void main(String[] args) {
		
        Carro c = new Carro();
        
        c.infor();
        c.ligar();
        c.infor();
        c.acelerar();
        c.infor();
        c.frear();
        c.infor();
	}
}


public class Motor {
    
    private boolean ligado = false;
    private double injecao = 1;
    
    double giros(){
        if(!ligado){
            return 0;
        }
        else{
            return injecao * 3000;
        } 
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public double getInjecao() {
        return injecao;
    }

    public void setInjecao(double injecao) {
        this.injecao += injecao;
    }
    
}

public class Carro {
    
    Motor motor = new Motor();
    
    
    public void ligar(){
        motor.setLigado(true);
    }
    public void desligar(){
        motor.setLigado(false);
    }
    public void acelerar(){
        motor.setInjecao(+0.5);
    }
    public void frear(){
        motor.setInjecao(-0.5);
    }
    public void infor(){
        System.out.println("Ligado: "+motor.getLigado());
        System.out.println("Rotacao do motor: "+motor.giros());
        System.out.println();
    }
    
}