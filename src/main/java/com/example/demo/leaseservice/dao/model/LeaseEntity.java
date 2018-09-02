package com.example.demo.leaseservice.dao.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * A lease is a contract which entitles a tenant / group of tenants to live in a property for a fixed monthly fee
 * <p>
 * Properties:
 * - start date
 * - duration (some leases are indefinite)
 * - monthly fee
 * <p>
 * Entities involved:
 * - exactly one property
 * - at least one tenant
 */
@Data
@Document
public class LeaseEntity {

    @Id
    private String id;

    private String propertyId;

    private String tenantGroupId;

    private long startDate;

    private int durationInDays;

    private int monthlyFee; // currency?

}
