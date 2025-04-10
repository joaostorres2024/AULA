package Exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		var fatura1 = new Fatura();
		
		System.out.print("Digite o nome do produto: ");
		fatura1.setNomeDoProduto(sc.next());
		System.out.print("Digite a descrição do produto: ");
		fatura1.setDescricao(sc.next());
		System.out.print("Digite o preço do produto: ");
		fatura1.setPrecoUnitario(sc.nextDouble());
		System.out.print("Digite a quantidade do produto: ");
		fatura1.setQuantidadeComprada(sc.nextInt());
		
		 System.out.println("\nProduto registrado!");
	     System.out.println("Nome: " + fatura1.getNomeDoProduto());
	     System.out.println("Descrição: " + fatura1.getDescricao());
	     System.out.println("Preço Unitário: " + fatura1.getPrecoUnitario());
	     System.out.println("Quantidade: " + fatura1.getQuantidadeComprada());
	     System.out.println("Fatura total: " + fatura1.getTotalFatura());
	}

}
