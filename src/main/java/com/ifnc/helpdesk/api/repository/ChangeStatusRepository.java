package com.ifnc.helpdesk.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ifnc.helpdesk.api.entity.ChangeStatus;

public interface ChangeStatusRepository extends MongoRepository<ChangeStatus, String>{

	public Iterable<ChangeStatus> findByTicketIdOrderByDataChangeStatusDesc(String ticketId);	
								   
}
