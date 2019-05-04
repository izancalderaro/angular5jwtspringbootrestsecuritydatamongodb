package com.ifnc.helpdesk.api.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Ticket {

	private String id;
	
	private User user;
	
}
