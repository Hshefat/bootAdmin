package com.sts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sts.models.Client;
import com.sts.models.InvoiceStatus;

@Repository
public interface InvoiceStatusRepostiory extends JpaRepository<InvoiceStatus, Integer> {

}