package LojaRacao;

public class Vendas {
	private int codigoVenda;
	private Produto produto;
	private int quantidadeProduto;
	private String dataVenda;
	private double valorVenda;
	
	public Vendas(int codigoVenda, Produto produto, int quantidadeProduto, String dataVenda, double valorVenda) {
		
		this.codigoVenda = codigoVenda;
		this.produto = produto;
		this.quantidadeProduto = quantidadeProduto;
		this.dataVenda = dataVenda;
		this.valorVenda = valorVenda;
	}
	
	public Vendas(){};

	public int getCodigoVenda() {
		return codigoVenda;
	}

	public void setCodigoVenda(int codigoVenda) {
		this.codigoVenda = codigoVenda;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}

	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}

	public String getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	};
	
	
	
	
	
}
