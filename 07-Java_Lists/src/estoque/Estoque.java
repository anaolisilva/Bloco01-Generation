package estoque;

import java.util.ArrayList;
import java.util.Scanner;

//Não tá funcionando direito mas não sei por que, corrigir.

public class Estoque {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		ArrayList<Produto> produtos = new ArrayList<>();
		
		System.out.println("Quantos produtos você deseja adicionar? ");
		int num = entrada.nextInt();
		
		entrada.nextLine();
		
		//cadastrando produtos
		for (int i = 0; i < num; i++) {
			System.out.println("Nome do produto: ");
			String nome = entrada.next();
			
			System.out.println("Código do produto: ");
			String codigo = entrada.next();
			
			System.out.println("Preço do produto: ");
			double preco = entrada.nextDouble();
			
			System.out.println("Quantidade em estoque: ");
			int quantidade = entrada.nextInt();
			System.out.println();
			
			produtos.add(new Produto(nome, codigo, preco, quantidade));

		}
		
		//imprimir a list
		for (int j = 0; j < produtos.size(); j++) {
			System.out.println(produtos.get(j));
		}
		
		
		//remover produto completamente
		
		System.out.println("Deseja remover produto? Digite 1 para sim e 2 para não.");
		int f = entrada.nextInt();
			
		
		if (f == 1) {
			System.out.println("Qual? Digite o nome. ");
			String nomeRemover = entrada.next();
			int i = 0, posicao = 0;
			
			for(Produto p : produtos) {
				if (nomeRemover == p.getNome()) {
					posicao = i;
				}
				i++;
			}
			
			produtos.remove(posicao);
		}
		
		//Modificar itens do produto (todas as categorias)
		System.out.println("Deseja modificar quantidade em estoque de produto? Digite 1 para sim e 2 para não.");
		f = entrada.nextInt();
		
		if (f == 1) {
			System.out.println("Qual? Digite o nome. ");
			String nomeRemover = entrada.next();
			int i = 0, posicao = 0;
			
			for(Produto p : produtos) {
				if (nomeRemover == p.getNome()) {
					posicao = i;
				}
				i++;
			}
			System.out.println("Para adicionar estoque, digite +; para remover, digite -.");
			String operacao = entrada.next();
			
			if (operacao == "+") {
				System.out.println("Quantas unidades deseja adicionar? ");
				int unidades = entrada.nextInt();
				int quantiaAnterior = produtos.get(posicao).getQuantidade();
				int novoTotal = quantiaAnterior + unidades;
				produtos.get(posicao).setQuantidade(novoTotal);
			} else if (operacao == "-") {
				System.out.println("Quantas unidades deseja diminuir? ");
				int unidades = entrada.nextInt();
				int quantiaAnterior = produtos.get(posicao).getQuantidade();
				int novoTotal = quantiaAnterior - unidades;
				produtos.get(posicao).setQuantidade(novoTotal);
			}
			
		}
		
		System.out.println("Deseja modificar preço, código ou nome de um produto? Digite 1 para sim e 2 para não.");
		f = entrada.nextInt();
		
		if (f == 1) {
			System.out.println("Para preço, digite P, Código C, Nome N");
			String categoria = entrada.next();
			System.out.println("Qual produto? Digite o nome conforme anteriormente cadastrado.");
			String nomeModificar = entrada.next();
			
			int i = 0, posicao = 0;
			
			for(Produto p : produtos) {
				if (nomeModificar == p.getNome()) {
					posicao = i;
				}
				i++;
			}
			if (categoria == "P" || categoria == "p") {
				System.out.println("Digite o novo preço do produto: ");
				double precoNovo = entrada.nextDouble();
				produtos.get(posicao).setPreco(precoNovo);
			
			} else if (categoria == "C" || categoria == "c") {
				System.out.println("Digite o novo código do produto: ");
				String codigoNovo = entrada.next();
				produtos.get(posicao).setCodigo(codigoNovo);
				
			} else if (categoria == "N" || categoria == "n") {
				System.out.println("Digite o novo nome do produto: ");
				String Novo = entrada.next();
				produtos.get(posicao).setNome(Novo);
			}
			
		
		}
	
		
		//imprimir a list atualizada
		for (Produto p : produtos) {
			System.out.println(p);
		}
		
		
	}

}
