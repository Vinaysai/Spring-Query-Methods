package com.sprinf.boot.all.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_curd")
public class Student {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "fname")
	private String fname;

	@Override
	public String toString() {
		return "Student [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
	}

	@Column(name = "lname")
	private String lname;

	public String getFname() {
		return fname;
	}

	public int getId() {
		return id;
	}

	public String getLname() {
		return lname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

}
