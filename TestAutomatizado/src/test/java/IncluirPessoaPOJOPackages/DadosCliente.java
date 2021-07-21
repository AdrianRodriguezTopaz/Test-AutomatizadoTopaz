package IncluirPessoaPOJOPackages;

public class DadosCliente{
	private String tipoCliente;
	private String titular;
	private String pessoaLigada;

	public void setTipoCliente(String tipoCliente){
		this.tipoCliente = tipoCliente;
	}

	public String getTipoCliente(){
		return tipoCliente;
	}

	public void setTitular(String titular){
		this.titular = titular;
	}

	public String getTitular(){
		return titular;
	}

	public void setPessoaLigada(String pessoaLigada){
		this.pessoaLigada = pessoaLigada;
	}

	public String getPessoaLigada(){
		return pessoaLigada;
	}
}
