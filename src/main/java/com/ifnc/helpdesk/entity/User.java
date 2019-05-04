package com.ifnc.helpdesk.entity;



import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.ifnc.helpdesk.api.entity.ProfileEnum;

@Document
public class User {
	
	@Id
 	private String id;
	
	@Indexed(unique = true)
	@NotBlank(message =  "Email requerido")
	@Email(message = "Email inválido")
	private String email;
	
	@NotBlank(message = "Password requerido")
	@Size(min = 6)
	private String password;
	
	private ProfileEnum profile;
	
	
	
	
	
	
	
}
