package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Plato;

@Repository
public interface PlatoRepository extends JpaRepository<Plato, Long> {

}
