package br.org.sesisp.view;

import java.util.Scanner;

import javax.swing.JOptionPane;

import br.org.sesisp.dao.CrudDAO;
import br.org.sesisp.model.FilmesSeries;

public class TelaMain {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//instanciando filmeseseries
		CrudDAO inserir_filmeseseries = new CrudDAO();
		FilmesSeries filmeseseries1 = new FilmesSeries();
		
		/*
		//CREATE
		System.out.println("======CRIANDO FILMES E SERIES======");
		System.out.println("Nome do filme:");
		filmeseseries1.setNome(entrada.nextLine());
		System.out.println("Ano de lancamento:");
		filmeseseries1.setAnoLancamento(entrada.nextInt());
		System.out.println("Faixa etaria:");
		filmeseseries1.setFaixaEtaria(entrada.nextInt());
		System.out.println("Genero:");
		filmeseseries1.setGenero(entrada.nextLine());
		entrada.nextLine();
		System.out.println("Sinopse:");
		filmeseseries1.setSinopse(entrada.nextLine());
		entrada.nextLine();
		inserir_filmeseseries.create(filmeseseries1);
		System.out.println("Nome do filme: " + filmeseseries1.getNome() + "Ano de lancamento: " + filmeseseries1.getAnoLancamento() + "\nFaixa etaria: " + filmeseseries1.getFaixaEtaria() +
		"\nGenero: " + filmeseseries1.getGenero() + "\nSinopse: " + filmeseseries1.getSinopse());
		System.out.println("===================================");
		
		
		//READ
		System.out.println("------LENDO FILMES E SERIES------");
		for(FilmesSeries filmeseseries : inserir_filmeseseries.read()) {
			System.out.println("\nDADOS: " + "\nColuna: " + filmeseseries.getColuna() + "\nNome do filme: " + filmeseseries1.getNome() + "\nAno de lancamento: " + filmeseseries.getAnoLancamento() + "\nFaixa etaria: " + filmeseseries.getFaixaEtaria() +
		"\nGenero: " + filmeseseries.getGenero() + "\nSinopse: " + filmeseseries.getSinopse());
		}
		System.out.println("---------------------------------");
		
		
		//UPLOAD
		System.out.println("<<ATUALIZANDO FILMES E SERIES>>");
		System.out.println("Atualize o filme/serie pelo numero da coluna: ");
		int novaColuna = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Atualize o nome:");
		String novoNome = entrada.nextLine();
		entrada.nextLine();
		System.out.println("Atualize o ano de lancamento:");
		int novoAnoLancamento = entrada.nextInt();
		System.out.println("Atualize a faixa etaria:");
		int novaFaixaEtaria = entrada.nextInt();
		System.out.println("Atualize o genero:");
		String novoGenero = entrada.nextLine();
		entrada.nextLine();
		System.out.println("Atualize a sinopse:");
		String novaSinopse = entrada.nextLine();
		entrada.nextLine();
		filmeseseries1.setColuna(novaColuna);
		filmeseseries1.setNome(novoNome);
		filmeseseries1.setAnoLancamento(novoAnoLancamento);
		filmeseseries1.setFaixaEtaria(novaFaixaEtaria);
		filmeseseries1.setGenero(novoGenero);
		filmeseseries1.setSinopse(novaSinopse);
		System.out.println("Nome do filme: " + filmeseseries1.getNome() + "\nAno de lancamento: " + filmeseseries1.getAnoLancamento() + "\nFaixa etaria: " + filmeseseries1.getFaixaEtaria() +
		"\nGenero: " + filmeseseries1.getGenero() + "\nSinopse: " + filmeseseries1.getSinopse() + "\n<<---------------------------->>");
		inserir_filmeseseries.update(filmeseseries1);
		
		
		//DELETE
		System.out.println("¡!DELETANDO FILMES E SERIES!¡");
		System.out.println("Digite a coluna dos filmes e series que quer deletar:");
		int colunaDeletar = entrada.nextInt();
		entrada.nextLine();
		CrudDAO deletar_filmeseseries = new CrudDAO();
		deletar_filmeseseries.delete(colunaDeletar);
		System.out.println("¡!-------------------------!¡");
		*/
		
		//ALTER TABLE filmeseseries AUTO_INCREMENT = 1;
		//SWITCH
		int opcao;
		do {
			String joptionpane = JOptionPane.showInputDialog("O que deseja fazer com os FILMES e SERIES?" + "\n1 - Criar" + "\n2 - Ler" + "\n3 - Atualizar" + "\n4 - Deletar"  + "\n5 - Cancelar" );
			opcao = Integer.parseInt(joptionpane);
			switch(opcao) {
				case 1:
					//CREATE
					System.out.println("======CRIANDO FILMES E SERIES======");
					System.out.println("Nome do filme/serie:");
					filmeseseries1.setNome(entrada.nextLine());
					System.out.println("Ano de lancamento:");
					filmeseseries1.setAnoLancamento(entrada.nextInt());
					System.out.println("Faixa etaria:");
					filmeseseries1.setFaixaEtaria(entrada.nextInt());
					System.out.println("Genero:");
					filmeseseries1.setGenero(entrada.next());
					entrada.nextLine();
					System.out.println("Sinopse:");
					filmeseseries1.setSinopse(entrada.nextLine());
					entrada.nextLine();
					inserir_filmeseseries.create(filmeseseries1);
					System.out.println("Nome do filme: " + filmeseseries1.getNome() + "\nAno de lancamento: " + filmeseseries1.getAnoLancamento() + "\nFaixa etaria: " + filmeseseries1.getFaixaEtaria() +
					"\nGenero: " + filmeseseries1.getGenero() + "\nSinopse: " + filmeseseries1.getSinopse());
					System.out.println("===================================");
					break;
				
				case 2:
					//READ
					System.out.println("------LENDO FILMES E SERIES------");
					for(FilmesSeries filmeseseries : inserir_filmeseseries.read()) {
						System.out.println("DADOS: " + "\nColuna: " + filmeseseries.getColuna() + "\nNome do filme/serie: " + filmeseseries.getNome() + "\nAno de lancamento: " + filmeseseries.getAnoLancamento() + "\nFaixa etaria: " + filmeseseries.getFaixaEtaria() +
					"\nGenero: " + filmeseseries.getGenero() + "\nSinopse: " + filmeseseries.getSinopse());
					}
					System.out.println("---------------------------------");
					break;
					
				case 3:
					//UPLOAD
					System.out.println("<<ATUALIZANDO FILMES E SERIES>>");
					System.out.println("Atualize o filme/serie pelo numero da coluna: ");
					int novaColuna = entrada.nextInt();
					entrada.nextLine();
					System.out.println("Atualize o nome:");
					String novoNome = entrada.nextLine();
					entrada.nextLine();
					System.out.println("Atualize o ano de lancamento:");
					int novoAnoLancamento = entrada.nextInt();
					System.out.println("Atualize a faixa etaria:");
					int novaFaixaEtaria = entrada.nextInt();
					System.out.println("Atualize o genero:");
					String novoGenero = entrada.nextLine();
					entrada.nextLine();
					System.out.println("Atualize a sinopse:");
					String novaSinopse = entrada.nextLine();
					entrada.nextLine();
					filmeseseries1.setColuna(novaColuna);
					filmeseseries1.setNome(novoNome);
					filmeseseries1.setAnoLancamento(novoAnoLancamento);
					filmeseseries1.setFaixaEtaria(novaFaixaEtaria);
					filmeseseries1.setGenero(novoGenero);
					filmeseseries1.setSinopse(novaSinopse);
					System.out.println("Nome do filme: " + filmeseseries1.getNome() + "\nAno de lancamento: " + filmeseseries1.getAnoLancamento() + "\nFaixa etaria: " + filmeseseries1.getFaixaEtaria() +
					"\nGenero: " + filmeseseries1.getGenero() + "\nSinopse: " + filmeseseries1.getSinopse());
					inserir_filmeseseries.update(filmeseseries1);
					System.out.println("<<---------------------------->>");
					break;
					
				case 4:
					//DELETE
					System.out.println("¡!DELETANDO FILMES E SERIES!¡");
					System.out.println("Digite a coluna do filme/serie que quer deletar:");
					int colunaDeletar = entrada.nextInt();
					entrada.nextLine();
					CrudDAO deletar_filmeseseries = new CrudDAO();
					deletar_filmeseseries.delete(colunaDeletar);
					System.out.println("¡!-------------------------!¡");
					break;
			}
		}while(opcao != 5);
	}

}
