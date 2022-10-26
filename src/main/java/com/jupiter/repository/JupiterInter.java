package com.jupiter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jupiter.entity.Jupiter;

@Repository
public interface JupiterInter extends JpaRepository<Jupiter, Integer> {

}
