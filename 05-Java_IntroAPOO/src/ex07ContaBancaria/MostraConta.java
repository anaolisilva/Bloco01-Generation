package ex07ContaBancaria;

import java.util.Scanner;

public class MostraConta {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		Conta contaBanco = new Conta();
		
		System.out.println("Digite seu nome: ");
		contaBanco.setNomeDono(in.nextLine());		
		System.out.println("Digite sua idade: ");
		contaBanco.setIdadeDono(in.nextInt());
		System.out.println("Digite seu CPF: ");
		contaBanco.setCpfDono(in.nextInt());
		
		in.close();
		
		contaBanco.setNumero(1234);
		contaBanco.setSaldo(2000.87);
		
		contaBanco.depositar(523.00);
		contaBanco.sacar(200);
		
		System.out.println();
		System.out.println("INFORMAÇÕES:");
		System.out.println("Nome: " + contaBanco.getNomeDono());
		System.out.println("Idade: " + contaBanco.getIdadeDono() + " anos");
		System.out.println("CPF: " + contaBanco.getCpfDono());
		System.out.println();
		System.out.println("Número da conta: " + contaBanco.getNumero());
		contaBanco.checarSaldo();
		
	}

}
