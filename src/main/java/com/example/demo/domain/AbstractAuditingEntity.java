//package com.example.demo.domain;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import jakarta.persistence.Column;
//import jakarta.persistence.EntityListeners;
//import jakarta.persistence.MappedSuperclass;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import org.springframework.data.annotation.CreatedBy;
//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.annotation.LastModifiedBy;
//import org.springframework.data.annotation.LastModifiedDate;
//import org.springframework.data.jpa.domain.support.AuditingEntityListener;
//
//import java.time.Instant;
//
//@MappedSuperclass
//@EntityListeners(AuditingEntityListener.class)
//@JsonIgnoreProperties(value = {"createdBy","createdDate","lastModifiedBy","lastModifiedDate","domainStatusId"},allowGetters = true)
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//public abstract class AbstractAuditingEntity {
//    @CreatedBy
//    @Column(name = "created_by", nullable = false, length = 50, updatable = false)
//    private String createdBy;
//
//    @CreatedDate
//    @Column(name = "created_date", nullable = false, updatable = false)
//    private Instant createdDate = Instant.now();
//
//    @LastModifiedBy
//    @Column(name = "last_modified_by", nullable = false, length = 50, updatable = false)
//    private String lastModifiedBy;
//
//    @LastModifiedDate
//    @Column(name = "last_modified_date", nullable = false, updatable = false)
//    private Instant lastModifiedDate = Instant.now();
//
//    @Column(name = "domain_status_id",nullable = false,columnDefinition = "integer default 1")
//    private Integer domainStatusId = 1;
//}
