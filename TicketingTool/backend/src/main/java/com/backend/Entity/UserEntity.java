package com.backend.Entity;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "UserEntity")
@Data
public class UserEntity {
    @Id
    ObjectId id;
    private String userName;
    private String password;
    private String role;
    @DBRef
    private List<TicketEntity> tickets = new ArrayList<>();
}

