package com.ifnc.helpdesk.api.enums;

public enum ProfileEnum {

	ADMINISTRATOR("Administrador"),
	CUSTOMER("Cliente"),
	TECHNICIAN("Técnico");
	
	private String descricao;

	ProfileEnum(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}	
		
}
