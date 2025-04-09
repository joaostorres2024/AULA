package Exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		var livro1 = new Livro();
		
		System.out.println("Deseja registrar um livro? (S/N): ");
		
		System.out.print("Nome do livro: ");
		livro1.setTitulo(sc.nextLine());
		System.out.print("Nome da editora: ");
		livro1.setEditora(sc.nextLine());
		System.out.print("Ano de lançamento: ");
		livro1.setAnoDeLancamento(sc.nextInt());
		System.out.print("Número de páginas: ");
		livro1.setNumPaginas(sc.nextInt());
		
		livro1.ImprimirInfo(livro1.getTitulo(), livro1.getEditora(), livro1.getAnoDeLancamento(), livro1.getNumPaginas());
		
	}
	

}
