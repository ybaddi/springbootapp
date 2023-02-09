package com.example.fm6.controllers;

import java.util.List;

import com.example.fm6.dao.PersonneDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.fm6.models.Personne;

@RestController
public class PersonneController {
	
	
	@Autowired
	public PersonneDao personneDao;
	
	// TODO    get /
	public List<Personne> getPersonne() {
		return personneDao.findAll();
	}
	
	// TODO Post
	
	
	// TODO Get by id

}
