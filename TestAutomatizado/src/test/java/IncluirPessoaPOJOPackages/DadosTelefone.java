package IncluirPessoaPOJOPackages;

public class DadosTelefone{
	private String telefone;
	private String tipoTelefone;
	private String ddd;
	private String ramal;

	public void setTelefone(String telefone){
		this.telefone = telefone;
	}

	public String getTelefone(){
		return telefone;
	}

	public void setTipoTelefone(String tipoTelefone){
		this.tipoTelefone = tipoTelefone;
	}

	public String getTipoTelefone(){
		return tipoTelefone;
	}

	public void setDdd(String ddd){
		this.ddd = ddd;
	}

	public String getDdd(){
		return ddd;
	}

	public void setRamal(String ramal){
		this.ramal = ramal;
	}

	public String getRamal(){
		return ramal;
	}
}
