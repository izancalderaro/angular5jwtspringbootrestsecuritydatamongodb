package com.ifnc.helpdesk.api.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.ifnc.helpdesk.api.entity.Ticket;

public interface TicketRepository extends MongoRepository<Ticket, String> {

	public Page<Ticket> findByUserIdOrderByDateDesc(Pageable pages, String userId);

	public Page<Ticket> findByTitleIgnoreCaseContainingAndStatusAndPriorityOrderByDateDesc(
			Pageable pages, String title, String status, String priority);

	public Page<Ticket> findByTitleIgnoreCaseContainingAndStatusAndPriorityAndUserIdOrderByDateDesc(
			Pageable pages, String title, String status, String priority);

	public Page<Ticket> findByTitleIgnoreCaseContainingAndStatusAndPriorityAndAssignedUserIdOrderByDateDesc(
			Pageable pages, String title, String status, String priority);

	public Page<Ticket> findByNumber(Pageable pages, Integer number);

}
