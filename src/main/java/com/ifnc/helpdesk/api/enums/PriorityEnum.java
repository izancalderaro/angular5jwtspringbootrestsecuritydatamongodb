package com.ifnc.helpdesk.api.enums;

public enum PriorityEnum {
	
	HIGH("Alta"),
	NORMAL("Normal"),
	LOW("Baixa");
	
	private String descricao;

	PriorityEnum(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}
