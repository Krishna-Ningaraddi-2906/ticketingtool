package com.backend.Controller.TicketController;

import com.backend.Entity.TicketEntity;
import com.backend.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ticket")
public class TicketController {
    @Autowired
    TicketService ticketService;

    //create Ticket
    @PostMapping("create-ticket")
    public ResponseEntity<?> createTicket(@RequestBody TicketEntity ticketEntity) {
        return new ResponseEntity<>(ticketService.createTicket(ticketEntity), HttpStatus.CREATED);
    }

    // get all tickets

    @GetMapping("get-all")
    public ResponseEntity<?> getAllTickets() {
        return new ResponseEntity<>(ticketService.getAllTickets(), HttpStatus.OK);
    }
}
