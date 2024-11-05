package LojaRacao;

public class Estoque {
	private Produto[] produtos;

	public Estoque(Produto[] produtos) {
	
		this.produtos = produtos;
	}
	
	public Estoque() {};

	public Produto[] getProdutos() {
		return produtos;
	}

	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}
	
	
}
