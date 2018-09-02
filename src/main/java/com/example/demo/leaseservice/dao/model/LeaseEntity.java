package com.example.demo.leaseservice.dao.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class LeaseEntity {

    @Id
    private String id;

}
