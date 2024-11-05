package LojaRacao;

public class Categoria {
	private int codigoCategoria;
	private String nomeCategora;
	private String descricaoCategoria;
	
	public Categoria(int codigoCategoria, String nomeCategora, String descricaoCategoria) {
		
		this.codigoCategoria = codigoCategoria;
		this.nomeCategora = nomeCategora;
		this.descricaoCategoria = descricaoCategoria;
	}
	
	public Categoria() {};

	public int getCodigoCategoria() {
		return codigoCategoria;
	}

	public void setCodigoCategoria(int codigoCategoria) {
		this.codigoCategoria = codigoCategoria;
	}

	public String getNomeCategora() {
		return nomeCategora;
	}

	public void setNomeCategora(String nomeCategora) {
		this.nomeCategora = nomeCategora;
	}

	public String getDescricaoCategoria() {
		return descricaoCategoria;
	}

	public void setDescricaoCategoria(String descricaoCategoria) {
		this.descricaoCategoria = descricaoCategoria;
	};
	
	
}
