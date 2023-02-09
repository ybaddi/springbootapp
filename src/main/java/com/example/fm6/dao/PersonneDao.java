package com.example.fm6.dao;

import com.example.fm6.models.Personne;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneDao extends JpaRepository<Personne, Long>{

}
