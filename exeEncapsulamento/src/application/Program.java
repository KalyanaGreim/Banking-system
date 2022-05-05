package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Acount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Acount acount;
		
		System.out.println("Digite o n�mero da conta: ");
		int conta = sc.nextInt();
		System.out.println("Digite o nome do titular: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.println("Possui dep�sito inicial (y/n)?");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.println("Insira o dep�sito inicial:");
			double saldoInicial = sc.nextDouble();
			acount = new Acount(conta, titular, saldoInicial);
		} else {
			acount = new Acount(conta, titular);
		}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(acount);
		
		System.out.println();
		System.out.print("Informe o valor do dep�sito: ");
		double valorDeposito = sc.nextDouble();
		acount.deposito(valorDeposito);
		System.out.println("Atualiza��o dos dados da conta: ");
		System.out.println(acount);
		
		System.out.println();
		System.out.print("Informe o valor do saque: ");
		double valorSaque = sc.nextDouble();
		acount.saque(valorSaque);
		System.out.println("Atualiza��o dos dados da conta: ");
		System.out.println(acount);
		
		
		
		
		
		
		
		sc.close();

	}

}
