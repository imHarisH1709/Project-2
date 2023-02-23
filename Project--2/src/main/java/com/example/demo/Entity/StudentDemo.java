package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="StudentDemo")
public class StudentDemo {
	
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public StudentDemo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public StudentDemo(){
		
	}
}