package LojaRacao;

public class Produto {
	
	private int codigoProduto;
	private String nomeProduto;
	private String marca;
	private double preco;
	private double quantidade;
	private Categoria categoria;
	
	public Produto(int codigoProduto, String nomeProduto, String marca, double preco, double quantidade,
			Categoria categoria) {
		
		this.codigoProduto = codigoProduto;
		this.nomeProduto = nomeProduto;
		this.marca = marca;
		this.preco = preco;
		this.quantidade = quantidade;
		this.categoria = categoria;
	}
	
	public Produto() {};

	public int getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	};
	
	
}


