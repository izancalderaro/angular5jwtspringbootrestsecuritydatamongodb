package com.ifnc.helpdesk.api.entity;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.ifnc.helpdesk.api.enums.StatusEnum;

@Document
public class ChangeStatus {

	private String id;
	
	@DBRef
	private Ticket ticket;
	
	@DBRef
	private User userChange;
	
	private Date dataChangeStatus;
	
    private StatusEnum status;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public User getUserChange() {
		return userChange;
	}

	public void setUserChange(User userChange) {
		this.userChange = userChange;
	}

	public Date getDataChangeStatus() {
		return dataChangeStatus;
	}

	public void setDataChangeStatus(Date dataChangeStatus) {
		this.dataChangeStatus = dataChangeStatus;
	}

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}
    
    
    
	
	
}
