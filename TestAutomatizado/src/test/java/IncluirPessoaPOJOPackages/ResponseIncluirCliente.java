package IncluirPessoaPOJOPackages;

public class ResponseIncluirCliente {
	private String tipoDocumento;
	private String codigoCliente;
	private String numeroDocumento;
	private String titular;
	private String pessoaLigada;

	public void setTipoDocumento(String tipoDocumento){
		this.tipoDocumento = tipoDocumento;
	}

	public String getTipoDocumento(){
		return tipoDocumento;
	}

	public void setCodigoCliente(String codigoCliente){
		this.codigoCliente = codigoCliente;
	}

	public String getCodigoCliente(){
		return codigoCliente;
	}

	public void setNumeroDocumento(String numeroDocumento){
		this.numeroDocumento = numeroDocumento;
	}

	public String getNumeroDocumento(){
		return numeroDocumento;
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
