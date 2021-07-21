package IncluirPessoaPOJOPackages;

public class IncluirContaCorrente{
	private String cestaId;
	private String produto;
	private String codigoCliente;
	private int diaCobrancaCesta;
	private String agencia;

	public void setCestaId(String cestaId){
		this.cestaId = cestaId;
	}

	public String getCestaId(){
		return cestaId;
	}

	public void setProduto(String produto){
		this.produto = produto;
	}

	public String getProduto(){
		return produto;
	}

	public void setCodigoCliente(String codigoCliente){
		this.codigoCliente = codigoCliente;
	}

	public String getCodigoCliente(){
		return codigoCliente;
	}

	public void setDiaCobrancaCesta(int diaCobrancaCesta){
		this.diaCobrancaCesta = diaCobrancaCesta;
	}

	public int getDiaCobrancaCesta(){
		return diaCobrancaCesta;
	}

	public void setAgencia(String agencia){
		this.agencia = agencia;
	}

	public String getAgencia(){
		return agencia;
	}
}
