package com.backend.Entity;


import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class TicketEntity {
    private ObjectId id;
    private String title;
    private String description;
    private String status;
}
