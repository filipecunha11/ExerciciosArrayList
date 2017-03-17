import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
/*	SEM OBJETOS	
 * Criar uma ArrayList vazia, que ira continuamente receber numeros interios inseridos pelo utilizador 
 * (so para quando o utilizador inserir 0 ou um valor menor). Cada numero inserido pelo utilizador deverá
 * ser inserido no local correto, de forma a manter a lista ordenada (crescente ou decrescente), não sendo 
 * permitido utilizar funções. Deverá haver ainda a possibilidade de percorrer a ArrayList e eliminar todos os numeros impares
*/
		semObjetos();
/* COM OBJETOS
 * Criar uma classe produtos (com nome, preço e quantidade) e apresentar um pequeno menu ao 
 * utilizador, onde ele possa decidir se pretende inserir, eliminar ou apenas listar todos os produtos.
 */
		System.out.println("\nClique numa tecla para o proximo exercicio\n");
		(new Scanner(System.in)).nextLine();
		comObjetos();
	}
	
	
	public static void semObjetos()
	{
		ArrayList<Integer> lista = new ArrayList<Integer>();
		int menu, temp;
		do {
			System.out.println("\nMENU\n1. Inserir\n2. Eliminar Impares\n3. Listar\n0. Sair\n");
			menu = (new Scanner(System.in)).nextInt();
			
			switch (menu)
			{
			case 1: System.out.println("\n\nINSERIR\n");
				do {
					System.out.println("Insira um numero (0 para sair): ");
					temp = ((new Scanner(System.in)).nextInt());
					if (temp <= 0)
						break;
					else
						lista.add(temp);
				} while (true);
				
				for (int i = 0; i < lista.size(); i++) {
			          for (int j = lista.size() - 1; j > i; j--) {
			              if (lista.get(i) > lista.get(j)) {
			                  temp = lista.get(i);
			                  lista.set(i,lista.get(j));
			                  lista.set(j,temp);
			              }
			          }
			     }
				break;
				
			case 2: System.out.println("\n\nELIMINAR IMPARES\n");
				for (int i = 0 ; i < lista.size() ; i++ )
					if (lista.get(i) % 2 != 0) lista.remove(i);
				break;
				
			case 3: System.out.println("\n\nLISTAR\n");
				for (int i = 0 ; i < lista.size() ; i++ )
					System.out.println(lista.get(i).intValue());
				break;
			}
		} while (menu != 0);
		
	}
	
	public static void comObjetos()
	{
		ArrayList<Produtos> lista = new ArrayList<Produtos>();
		String nome; float preco;
		int menu, quant;
		boolean removido = false;
		do {
			System.out.println("\nMENU\n1. Inserir\n2. Eliminar\n3. Listar\n0. Sair\n");
			menu = (new Scanner(System.in)).nextInt();
			
			switch (menu)
			{
			case 1: System.out.println("\n\nINSERIR\n");
				System.out.print("Insira o nome do produto: ");
				nome = (new Scanner(System.in)).nextLine();
				System.out.print("Insira o preço do produto: ");
				preco = (new Scanner(System.in)).nextFloat();
				System.out.print("Insira a quantidade em armazem: ");
				quant = (new Scanner(System.in)).nextInt();
				Produtos prod = new Produtos(nome, preco, quant);
				lista.add(prod);
				System.out.println("Produto inserido com sucesso!\n");
				break;
				
			case 2: System.out.println("\n\nELIMINAR\n");
				System.out.print("Insira o nome do produto a eliminar: ");
				nome = (new Scanner(System.in)).nextLine();
				for (int i = 0 ; i < lista.size() ; i++ )
				{
					if (lista.get(i).getNome() == nome)
					{
						lista.remove(i);
						removido = true;
						break;
					}
					else
						removido = false;
				}
				if (removido)
					System.out.print("Produto removido com sucesso!");
				else
					System.out.print("Não foi encontrado nenhum produto com esse nome.");
				break;
				
			case 3: System.out.println("\n\nLISTAR\n");
				for (int i = 0 ; i < lista.size() ; i++ )
					System.out.println("Nome: " +lista.get(i).getNome() + 
							"\nPreço: " + lista.get(i).getPreco() + 
							"\nQuantidade: " + lista.get(i).getQuant());
				break;
			}
		} while (menu != 0);
	}

}
