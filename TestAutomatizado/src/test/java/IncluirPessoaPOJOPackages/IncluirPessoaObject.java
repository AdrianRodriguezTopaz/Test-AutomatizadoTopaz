package IncluirPessoaPOJOPackages;

public class IncluirPessoaObject{
	private DocumentoAdicional documentoAdicional;
	private String tipoDocumento;
	private DadosBasicos dadosBasicos;
	private DadosEmail dadosEmail;
	private DadosEndereco dadosEndereco;
	private DadosTelefone dadosTelefone;
	private DadosRenda dadosRenda;
	private String numeroDocumento;
	private DadosProfissao dadosProfissao;
	private DadosCliente dadosCliente;

	public void setDocumentoAdicional(DocumentoAdicional documentoAdicional){
		this.documentoAdicional = documentoAdicional;
	}

	public DocumentoAdicional getDocumentoAdicional(){
		return documentoAdicional;
	}

	public void setTipoDocumento(String tipoDocumento){
		this.tipoDocumento = tipoDocumento;
	}

	public String getTipoDocumento(){
		return tipoDocumento;
	}

	public void setDadosBasicos(DadosBasicos dadosBasicos){
		this.dadosBasicos = dadosBasicos;
	}

	public DadosBasicos getDadosBasicos(){
		return dadosBasicos;
	}

	public void setDadosEmail(DadosEmail dadosEmail){
		this.dadosEmail = dadosEmail;
	}

	public DadosEmail getDadosEmail(){
		return dadosEmail;
	}

	public void setDadosEndereco(DadosEndereco dadosEndereco){
		this.dadosEndereco = dadosEndereco;
	}

	public DadosEndereco getDadosEndereco(){
		return dadosEndereco;
	}

	public void setDadosTelefone(DadosTelefone dadosTelefone){
		this.dadosTelefone = dadosTelefone;
	}

	public DadosTelefone getDadosTelefone(){
		return dadosTelefone;
	}

	public void setDadosRenda(DadosRenda dadosRenda){
		this.dadosRenda = dadosRenda;
	}

	public DadosRenda getDadosRenda(){
		return dadosRenda;
	}

	public void setNumeroDocumento(String numeroDocumento){
		this.numeroDocumento = numeroDocumento;
	}

	public String getNumeroDocumento(){
		return numeroDocumento;
	}

	public void setDadosProfissao(DadosProfissao dadosProfissao){
		this.dadosProfissao = dadosProfissao;
	}

	public DadosProfissao getDadosProfissao(){
		return dadosProfissao;
	}

	public void setDadosCliente(DadosCliente dadosCliente){
		this.dadosCliente = dadosCliente;
	}

	public DadosCliente getDadosCliente(){
		return dadosCliente;
	}
}
