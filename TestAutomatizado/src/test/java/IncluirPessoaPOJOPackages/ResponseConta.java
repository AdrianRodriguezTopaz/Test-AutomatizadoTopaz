package IncluirPessoaPOJOPackages;

public class ResponseConta{
	private String numeroConta;
	private String tipoConta;
	private String agencia;

	public void setNumeroConta(String numeroConta){
		this.numeroConta = numeroConta;
	}

	public String getNumeroConta(){
		return numeroConta;
	}

	public void setTipoConta(String tipoConta){
		this.tipoConta = tipoConta;
	}

	public String getTipoConta(){
		return tipoConta;
	}

	public void setAgencia(String agencia){
		this.agencia = agencia;
	}

	public String getAgencia(){
		return agencia;
	}
}
