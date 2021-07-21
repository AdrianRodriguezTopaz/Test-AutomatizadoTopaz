package IncluirPessoaPOJOPackages;

public class DadosRenda{
	private String rendaComprovada;
	private String rendaPresumida;
	private int rendaBruta;
	private int rendaLiquida;

	public void setRendaComprovada(String rendaComprovada){
		this.rendaComprovada = rendaComprovada;
	}

	public String getRendaComprovada(){
		return rendaComprovada;
	}

	public void setRendaPresumida(String rendaPresumida){
		this.rendaPresumida = rendaPresumida;
	}

	public String getRendaPresumida(){
		return rendaPresumida;
	}

	public void setRendaBruta(int rendaBruta){
		this.rendaBruta = rendaBruta;
	}

	public int getRendaBruta(){
		return rendaBruta;
	}

	public void setRendaLiquida(int rendaLiquida){
		this.rendaLiquida = rendaLiquida;
	}

	public int getRendaLiquida(){
		return rendaLiquida;
	}
}
