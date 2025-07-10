package com.backend.Repository;

import com.backend.Entity.TicketEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TicketsRepository extends MongoRepository <TicketEntity, ObjectId>
{

}
