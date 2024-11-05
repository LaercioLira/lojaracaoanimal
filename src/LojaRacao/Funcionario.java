package LojaRacao;

public class Funcionario {
	private int codigoFuncionario;
	private String nomeFuncionario;
	
	public Funcionario(int codigoFuncionario, String nomeFuncionario) {
	
		this.codigoFuncionario = codigoFuncionario;
		this.nomeFuncionario = nomeFuncionario;
	}
	
	public Funcionario() {};

	public int getCodigoFuncionario() {
		return codigoFuncionario;
	}

	public void setCodigoFuncionario(int codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	
	
	
}
