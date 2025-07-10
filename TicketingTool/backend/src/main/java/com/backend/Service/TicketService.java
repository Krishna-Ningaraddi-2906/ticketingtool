package com.backend.Service;

import com.backend.Entity.TicketEntity;
import com.backend.Repository.TicketsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TicketService {
    @Autowired
    TicketsRepository ticketsRepository;

    //create ticket
    public TicketEntity createTicket(TicketEntity ticketEntity) {
        return ticketsRepository.save(ticketEntity);
    }

    // get all tickets
    public List<TicketEntity> getAllTickets() {
        return ticketsRepository.findAll();
    }
}
