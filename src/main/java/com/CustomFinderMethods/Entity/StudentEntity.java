package com.CustomFinderMethods.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentEntity {
	@Id
	private int id;
	private String name;

	private String branch;
	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", name=" + name + ", branch=" + branch + "]";
	}
	public StudentEntity(int id, String name, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
	}
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
	public String getbranch() {
		return branch;
	}
	public void setbranch(String branch) {
		this.branch = branch;
	}
	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
