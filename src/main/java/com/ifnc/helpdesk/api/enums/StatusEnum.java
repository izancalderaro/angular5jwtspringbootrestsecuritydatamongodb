package com.ifnc.helpdesk.api.enums;

public enum StatusEnum {

	New("Novo"),
	Assigned("Designado"),
	Resolved("Resolvido"),
	Approved("Aprovado"),
	Disapproved("Reprovado"),
	Closed("Fechada");       

	
	private String descricao;

	StatusEnum(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}	
		
}
