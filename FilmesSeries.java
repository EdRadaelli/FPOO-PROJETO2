package br.org.sesisp.model;

public class FilmesSeries {
	
	//atributos
	public int coluna;
	public String nome;
	public int anoLancamento;
	public int faixaEtaria;
	public String genero;
	public String sinopse;
	
	//métodos construtores
	public FilmesSeries() {
		
	}
	public FilmesSeries(int coluna, String nome, int anoLancamento, int faixaEtaria, String genero, String sinopse) {
		this.coluna = coluna;
		this.nome = nome;
		this.anoLancamento = anoLancamento;
		this.faixaEtaria = faixaEtaria;
		this.genero = genero;
		this.sinopse = sinopse;
	}
	
	//métodos getters e setters
	public int getColuna() {
		return this.coluna;
	}
	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getAnoLancamento() {
		return this.anoLancamento;
	}
	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	
	public int getFaixaEtaria() {
		return this.faixaEtaria;
	}
	public void setFaixaEtaria(int faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}
	
	public String getGenero() {
		return this.genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getSinopse() {
		return this.sinopse;
	}
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
}
