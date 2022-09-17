package br.com.funcionarios.enums;

public enum TipoContratosEnum  {

	 	
	REGIME_HORA_HOMEM ("Regime Hora/Homem"),
	BODY_SHOP ("Body Shop");
	
	
	private String tipoContratoEnum;

	public String getTipoContratoEnum() {
		return tipoContratoEnum;
	}

	public void setTipoContratoEnum(String tipoContratoEnum) {
		this.tipoContratoEnum = tipoContratoEnum;
	}
	
	
	TipoContratosEnum (String tipoContratoEnum){
		this.tipoContratoEnum = tipoContratoEnum;
	}
	
	
	
	
	
}
