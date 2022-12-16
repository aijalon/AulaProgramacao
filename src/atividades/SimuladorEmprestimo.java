package atividades;

import java.util.Scanner;

//	Uma financeira contratou um programador para desenvolver um programa que calcula o custo total de empr�stimos para seus clientes, por�m o contrato foi cancelado e voc� foi chamado para concluir a programa��o do sistema.
//
//	O c�digo-fonte abaixo (incompleto) foi repassado para voc� fazer seu trabalho:
//	
//	O cliente tamb�m te informou que a taxa de juros da financeira depende da quantidade de parcelas:
//
//		1 ou 2 parcelas: 1,99% ao m�s
//		3 parcelas: 2,99% ao m�s
//		Outras quantidades de parcelas: 3,99% ao m�s
//		Al�m disso, caso o valor do empr�stimo seja maior ou igual a 100, uma tarifa fixa ser� cobrada no valor de R$1,50.


public class SimuladorEmprestimo {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Valor do empr�stimo: ");
    double valorEmprestimo = entrada.nextDouble();

    System.out.print("Quantidade de parcelas: ");
    int quantidadeParcelas = entrada.nextInt();

    double taxaJuros = 0; // switch expression aqui

    double tarifaFixa = 0; // use operador if aqui
    double totalJuros = valorEmprestimo * (taxaJuros / 100 * quantidadeParcelas);
    double custoTotal = valorEmprestimo + tarifaFixa + totalJuros;

    System.out.printf("Tarifa fixa: R$%.2f%n", tarifaFixa);
    System.out.printf("Total de juros: R$%.2f%n", totalJuros);
    System.out.printf("Custo total: R$%.2f%n", custoTotal);
    
    
    entrada.close();
  }

}