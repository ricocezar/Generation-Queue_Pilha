package PacoteJava;

import java.util.Scanner;
import java.util.Stack;

public class Pilha1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
			Stack<String> pilha = new Stack<String>();
			
			int op=-1;
			
			while (op !=0) {
				System.out.println("\nMenu de Opções");
				System.out.println("\n1 - Adicionar um novo livro na pilha:");
				System.out.println("\n2 - Listar todos os livros:");
				System.out.println("\n3 - Retirar um livro da pilha:");
				System.out.println("\n0 - Sair:");
				System.out.println("\nEntre com a opção desejada:");

				op = ler.nextInt();
				ler.nextLine();
	
				switch(op) {
				
				case 1:
					System.out.println("\nDigite o nome do Livro: ");
					String livros = ler.nextLine();
					pilha.push(livros);
					System.out.println("Livro adicionado à estante!");
					System.out.println(pilha);
					break;
				
				case 2:
					if (pilha.empty()) {
						System.out.println("A estante está vazia!!");
					}else {
						System.out.println("\nLista de livros na estante: ");
						for (String livro: pilha) {
							System.out.println(livro);
						}	
					}
					break;
				
				case 3:
					if (pilha.isEmpty()) {
						System.out.println("A estante está vazia!");
					}else {
						String NovaEstante = pilha.pop();
						System.out.println("O Livro retirado foi: "+NovaEstante);
						System.out.println("Livros atualizados na estante: "+pilha);
					}		
					break;
					
				case 0:
					System.out.println("\nPrograma Finalizado!!");
					break;

				default:
					System.out.println("\nOpção Inválida. Digite novamente");
					break;		
				}		

			}
	}
}
		