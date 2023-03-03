package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.TransactionDetails;

public interface TransactionRepository extends JpaRepository<TransactionDetails, Long>{

}
