package com.ecommerce.clothing_shop.entity;

import jakarta.persistence.Column;

import java.util.Date;

public abstract class AuditableEntity {
    @Column(length = 36,nullable = false)
    protected String createdBy;
    @Column(length = 36,nullable = false)

    protected String updatedBy;
    @Column(nullable = false)
    protected Date createdAt = new Date();
    @Column(nullable = false)
    protected Date updatedAt = new Date();

}
