package projetoContas;

import java.util.Scanner;
import projetoContas.Conta;

public class Tela {

  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    String nome;
    int opcao;



    System.out.println("=== SISTEMA DE CONTAS ===\n");
    System.out.print("Nome: ");
    nome = teclado.next();
    Conta c1 = new Conta(nome);
    System.out.println();

    do {
      System.out.println(
          "=MENU DE OPÇÕES=\n1 - Saldo\n2 - Sacar\n3 - Depositar\n4 - Informações\n0 - Sair\n");
      System.out.print("Opcao: ");
      opcao = teclado.nextInt();

      switch (opcao) {
        case 1:
          c1.saldo();
          break;
        case 2:
          System.out.print("Valor: ");
          c1.sacar(teclado.nextDouble());
          break;
        case 3:
          System.out.print("Valor: ");
          c1.depositar(teclado.nextDouble());
          break;
        case 4:
          c1.dadosBancarios();
          break;
        case 0:
        System.out.println("Finalizado!");
        break;
        
        default:
          System.out.println("Opção invalida!");
      }
    } while (opcao != 0);
    
    teclado.close();
  }
}
