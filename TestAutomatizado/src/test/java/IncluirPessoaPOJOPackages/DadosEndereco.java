package IncluirPessoaPOJOPackages;

public class DadosEndereco{
	private String complemento;
	private int numero;
	private String logradouro;
	private String bairro;
	private String tipoResidencia;
	private String tipoLogradouro;
	private String tipoEndereco;
	private String cep;

	public void setComplemento(String complemento){
		this.complemento = complemento;
	}

	public String getComplemento(){
		return complemento;
	}

	public void setNumero(int numero){
		this.numero = numero;
	}

	public int getNumero(){
		return numero;
	}

	public void setLogradouro(String logradouro){
		this.logradouro = logradouro;
	}

	public String getLogradouro(){
		return logradouro;
	}

	public void setBairro(String bairro){
		this.bairro = bairro;
	}

	public String getBairro(){
		return bairro;
	}

	public void setTipoResidencia(String tipoResidencia){
		this.tipoResidencia = tipoResidencia;
	}

	public String getTipoResidencia(){
		return tipoResidencia;
	}

	public void setTipoLogradouro(String tipoLogradouro){
		this.tipoLogradouro = tipoLogradouro;
	}

	public String getTipoLogradouro(){
		return tipoLogradouro;
	}

	public void setTipoEndereco(String tipoEndereco){
		this.tipoEndereco = tipoEndereco;
	}

	public String getTipoEndereco(){
		return tipoEndereco;
	}

	public void setCep(String cep){
		this.cep = cep;
	}

	public String getCep(){
		return cep;
	}
}
