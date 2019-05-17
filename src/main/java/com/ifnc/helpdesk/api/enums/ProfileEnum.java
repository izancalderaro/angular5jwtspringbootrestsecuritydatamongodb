package com.ifnc.helpdesk.api.enums;

public enum ProfileEnum {

	ROLE_ADMIN("Administrador"),
	ROLE_CUSTOMER("Cliente"),
	ROLE_TECHNICIAN("Técnico");
	
	private String descricao;

	ProfileEnum(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}	
		
}
