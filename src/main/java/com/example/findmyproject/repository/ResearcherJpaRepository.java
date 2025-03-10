package com.example.findmyproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.findmyproject.model.Researcher;

@Repository
public interface ResearcherJpaRepository extends JpaRepository<Researcher, Integer> {

}