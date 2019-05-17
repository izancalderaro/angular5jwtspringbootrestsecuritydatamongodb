package com.ifnc.helpdesk.api.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.ifnc.helpdesk.api.entity.Ticket;

public interface TicketRepository extends MongoRepository<Ticket, String> {

	public Page<Ticket> findByUserIdOrderByDateDesc(Pageable pages, String userId);

	public Page<Ticket> findByTitleIgnoreCaseContainingAndStatusIgnoreCaseContainingAndPriorityIgnoreCaseContainingOrderByDateDesc(
			Pageable pages, String title, String status, String priority);

	public Page<Ticket> findByTitleIgnoreCaseContainingAndStatusIgnoreCaseContainingAndPriorityIgnoreCaseContainingAndUserIdOrderByDateDesc(
			Pageable pages, String title, String status, String priority, String UserId);

	public Page<Ticket> findByTitleIgnoreCaseContainingAndStatusIgnoreCaseContainingAndPriorityIgnoreCaseContainingAndAssignedUserIdOrderByDateDesc(
			Pageable pages, String title, String status, String priority, String AssignedUserId);

	public Page<Ticket> findByNumber(Pageable pages, Integer number);

}
                         