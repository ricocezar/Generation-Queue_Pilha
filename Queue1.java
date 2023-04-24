package PacoteJava;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Queue<String> fila= new LinkedList<String>();
		int op;
		
		do {
			System.out.println("\nMenu de Opções");
			System.out.println("\n1 - Adicionar clientes na fila:");
			System.out.println("\n2 - Listar todos os clientes:");
			System.out.println("\n3 - Retirar clientes da fila:");
			System.out.println("\n0 - Finalizar o programa:");
			System.out.println("\nEntre com a opção desejada:");

			op = ler.nextInt();
			ler.nextLine();
			
											
		switch(op) {
		
		case 1:
			String nomeCliente = ler.nextLine();
			System.out.println("\nDigite o nome do cliente: "+nomeCliente);
			fila.add(nomeCliente);
			System.out.println("Cliente adicionado à fila!");
			break;
		
		case 2:
			System.out.println("\nClientes na fila: ");
			for (String cliente: fila) {
				System.out.println("- "+cliente);
			}
			break;
		
		case 3:
			if (fila.isEmpty()) {
				System.out.println("A fila está vazia!");
			}else {
				String clienteChamado = fila.remove();
				System.out.println("Cliente "+clienteChamado);
			}
			break;
			
		case 0:
			System.out.println("\nPrograma Finalizado!!");
			break;

		default:
			System.out.println("\nOpção Inválida. Digite novamente");
			break;		
		}		
	}while (op != 0);

	}
}