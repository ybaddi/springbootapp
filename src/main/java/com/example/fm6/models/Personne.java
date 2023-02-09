package com.example.fm6.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@ToString
@NoArgsConstructor
public class Personne {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	
	private String firstname;
	private String secondname;
	private int age;
	public Personne(String firstname, String secondname, int age) {
		super();
		this.firstname = firstname;
		this.secondname = secondname;
		this.age = age;
	}
	
	
	
}
