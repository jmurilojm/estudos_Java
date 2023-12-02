package ooEstudos.composicaoTemUm;

public class Carro {


String modelo;
String cor;
int ano;
Motor motor;


Carro(){
  
}


void dados(){
  System.out.println("Modelo: "+modelo);
  System.out.println("Cor: "+cor);
  System.out.println("Ano: "+ano);
  System.out.println("Tipo do motor: "+this.motor.tipo); System.out.println("Potencia do motor: "+this.motor.potencia);
}





}
